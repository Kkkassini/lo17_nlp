grammar tal_sql;

VOULOIR : 'vouloir'
;
ARTICLE : 'article'
;
BULLETIN : 'bulletin'
;
IMAGE	:'image'
;
CONTACT : 'contact'
;
NOMBRE	:'nombre'
	;
ORDRE	:'premier'
	;
AUTEUR : 'auteur'
	;
RUBRIQUE: 'rubrique'
	;
DATE: 'date'
	;

PERIODE : 'mois'|'annee'
;

MOT : 'mot'
;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre, par_arbre;}: 
		r = requete 
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
		(par2 = requete
			{
				par_arbre = $par2.req_arbre;
				lr_arbre.ajouteFils(new Arbre("", "1OR"));
				lr_arbre.ajouteFils(par_arbre);
			}
		)?
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		VOULOIR 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct "));
			} 
			
		ob = objets
			{
				ps_arbre = $ob.objets_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		(MOT
			{
				//req_arbre.ajouteFils(new Arbre("","from "));
				req_arbre.ajouteFils(new Arbre("","where "));
			})?
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
			
;
objets returns [Arbre objets_arbre = new Arbre("")]
	@init	{Arbre objet1_arbre, objet2_arbre;} : 
		
		(objet1 = objet 
			{
				objet1_arbre = $objet1.obj_arbre;
				//objets_arbre.ajouteFils(new Arbre("", "evénement"));
				objets_arbre.ajouteFils(objet1_arbre);
			})*
		objet2 = objetfin
			{
				objet2_arbre = $objet2.objfin_arbre;
				//objets_arbre.ajouteFils(new Arbre("", "OR"));
				objets_arbre.ajouteFils(objet2_arbre);
			}
		
;
objetfin returns [Arbre objfin_arbre = new Arbre("")]
	@init {Arbre obj2_arbre;} : 
		(PERIODE
			{
			objfin_arbre.ajouteFils(new Arbre("","period"));
			})?
		(NOMBRE
			{
				objfin_arbre.ajouteFils(new Arbre("","count "));
			}
		|ORDRE
			{
				objfin_arbre.ajouteFils(new Arbre("","ordre"));
			})?
		(ARTICLE
			{
				objfin_arbre.ajouteFils(new Arbre("","fichier from"));
			}
		 | BULLETIN
			{
			objfin_arbre.ajouteFils(new Arbre("","numero from"));
			}
		/*| AUTEUR
			{
			objfin_arbre.ajouteFils(new Arbre("","auteur from"));
			}*/
		| RUBRIQUE
			{
			objfin_arbre.ajouteFils(new Arbre("","rubrique from"));
			}
		/*| IMAGE
			{
			objfin_arbre.ajouteFils(new Arbre("","image"));
			}*/
		| CONTACT
			{
			objfin_arbre.ajouteFils(new Arbre("","email from "));
			}
		| DATE
			{
			objfin_arbre.ajouteFils(new Arbre("","jour,mois,annee from public.date"));
			}
		)
;
objet returns [Arbre obj_arbre = new Arbre("")]
	@init {Arbre obj1_arbre;} : 
		(PERIODE
			{
			obj_arbre.ajouteFils(new Arbre("","period"));
			})?
		(NOMBRE
			{
				obj_arbre.ajouteFils(new Arbre("","nombre"));
			}
		|ORDRE
			{
				obj_arbre.ajouteFils(new Arbre("","ordre"));
			})?
		(ARTICLE
			{
				obj_arbre.ajouteFils(new Arbre("","titre,"));
			}
		 | BULLETIN
			{
			obj_arbre.ajouteFils(new Arbre("","bulletin,"));
			}
		| AUTEUR
			{
			obj_arbre.ajouteFils(new Arbre("","auteur,"));
			}
		| RUBRIQUE
			{
			obj_arbre.ajouteFils(new Arbre("","rubrique,"));
			}
		| IMAGE
			{
			obj_arbre.ajouteFils(new Arbre("","image,"));
			}
		| CONTACT
			{
			obj_arbre.ajouteFils(new Arbre("","email,"));
			}
		| DATE
			{
			obj_arbre.ajouteFils(new Arbre("","date,"));
			}
		)
;
params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				/les_pars_arbre.ajouteFils(new Arbre("", "evénement"));
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		( par2 = params
			{
				par2_arbre = $par2.les_pars_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "2OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)?
;

param returns [Arbre lepar_arbre = new Arbre("")] 
	@init	{Arbre par0_arbre;} :
		(ARTICLE
			{
				obj_arbre.ajouteFils(new Arbre("","titre,"));
			}
		
		| AUTEUR
			{
			obj_arbre.ajouteFils(new Arbre("","auteur,"));
			}
		| RUBRIQUE
			{
			obj_arbre.ajouteFils(new Arbre("","rubrique,"));
			}
		| IMAGE
			{
			obj_arbre.ajouteFils(new Arbre("","image,"));
			}
		| CONTACT
			{
			obj_arbre.ajouteFils(new Arbre("","email = "));
			}
		| DATE
			{
			obj_arbre.ajouteFils(new Arbre("","date,"));
			}
		)
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;

