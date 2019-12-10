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

VAR 	: ('A'..'Z'|'a'..'z')+
;
ANNEE	: ('1'|'2')('0'..'9')('0'..'9')('0'..'9')
;
JOUR	: ('1'|'2'|'3')('0'..'9')
;
MOIS	:  ('0')('1'..'9')| ('1')('0'..'2')
;


listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre, par_arbre;}: 
		r = requete 
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
		
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		VOULOIR 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct "));
			} 
			
		ob = objet
			{
				ps_arbre = $ob.obj_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
			
;

/*objets returns [Arbre objets_arbre = new Arbre("")]
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
		
;*/

/*objetfin returns [Arbre objfin_arbre = new Arbre("")]
	@init {Arbre obj2_arbre;} : 
		/*(PERIODE
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
			objfin_arbre.ajouteFils(new Arbre("","numero from "));
			}
		| AUTEUR
			{
			objfin_arbre.ajouteFils(new Arbre("","auteur from"));
			}
		| RUBRIQUE
			{
			objfin_arbre.ajouteFils(new Arbre("","rubrique from"));
			}
		| IMAGE
			{
			objfin_arbre.ajouteFils(new Arbre("","image"));
			}
		| CONTACT
			{
			objfin_arbre.ajouteFils(new Arbre("","email from public.email"));
			}
		| DATE
			{
			objfin_arbre.ajouteFils(new Arbre("","jour,mois,annee from public.date"));
			}
		)
;*/
objet returns [Arbre obj_arbre = new Arbre("")]
	@init {Arbre obj1_arbre;} : 
		/*(PERIODE
			{
			obj_arbre.ajouteFils(new Arbre("","period "));
			})?*/
		
		((NOMBRE
			{
			obj_arbre.ajouteFils(new Arbre("","count "));
			})?
		  (ARTICLE
			{
			obj_arbre.ajouteFils(new Arbre("","fichier "));
			obj_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
			}
		
		  |BULLETIN
			{
			obj_arbre.ajouteFils(new Arbre("","numero "));
			obj_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
			})
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
			obj_arbre.ajouteFils(new Arbre("","jour,mois,annee from public.date d where"));
			}
		)
;
params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;String p;} : 
		
		par1 = parambegin 
			{
				par1_arbre = $par1.parb_arbre;
				//les_pars_arbre.ajouteFils(new Arbre("", "evénement"));
				les_pars_arbre.ajouteFils(par1_arbre);
				
				les_pars_arbre.ajouteFils(new Arbre(""));
			}
		(( par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				//les_pars_arbre.ajouteFils(new Arbre("", "2OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)+)?
;

parambegin returns [Arbre parb_arbre = new Arbre("")] 
	@init	{String t = "mot";String p = "=";} :
		
		MOT
			{
				//req_arbre.ajouteFils(new Arbre("","from "));
				parb_arbre.ajouteFils(new Arbre("","where "));
			}
		  a = VAR
			{ 
			parb_arbre.ajouteFils(new Arbre("tt.mot = ", "'"+a.getText()+"'"));
			}
		
		|ARTICLE
			{
				//req_arbre.ajouteFils(new Arbre("","from "));
				parb_arbre.ajouteFils(new Arbre("","where tt.mot "));
			}
		  a = VAR
			{ 
			parb_arbre.ajouteFils(new Arbre(" = ", "'"+a.getText()+"'"));
			}
		
		| AUTEUR
			{
			parb_arbre.ajouteFils(new Arbre("",",public.email e where e.email "));
			}
		  a = VAR
			{ 
			parb_arbre.ajouteFils(new Arbre("like ", "'\%"+a.getText()+"\%'"));
			}
		| RUBRIQUE
			{
			parb_arbre.ajouteFils(new Arbre("","where rubrique "));
			}
		   a = VAR
			{ 
			parb_arbre.ajouteFils(new Arbre("like ", "'\%"+a.getText()+"\%'"));
			}
		| IMAGE
			{
			parb_arbre.ajouteFils(new Arbre("","where image "));
			}
		  a = VAR
			{ 
			parb_arbre.ajouteFils(new Arbre("= ", "'"+a.getText()+"'"));
			}
		| CONTACT
			{
			parb_arbre.ajouteFils(new Arbre("","public.email e where e.email "));
			}
		   a = VAR
			{ 
			parb_arbre.ajouteFils(new Arbre("like ", "'\%"+a.getText()+"\%'"));
			}
		| DATE
			{
			parb_arbre.ajouteFils(new Arbre("","public.date d where e.email "));
			}

		( b = ANNEE
			{
			parb_arbre.ajouteFils(new Arbre("from public.date where annee"+"'"+b.getText()+"'"));
			}
		| c = MOIS
			{
			parb_arbre.ajouteFils(new Arbre("from public.date where moi"+"'"+c.getText()+"'"));
			}
		| d = JOUR
			{
			parb_arbre.ajouteFils(new Arbre("from public.date where jour"+"'"+d.getText()+"'"));
			}
			)
;



param returns [Arbre lepar_arbre = new Arbre("")] 
	@init	{Arbre par0_arbre;String t = "mot";} :
		  a = VAR
			{ 
			lepar_arbre.ajouteFils(new Arbre("intersect select distinct tt.fichier from public.titretexte tt where tt.mot = ", "'"+a.getText()+"'"));
			}
		
		|ARTICLE
			{
			//req_arbre.ajouteFils(new Arbre("","from "));
			lepar_arbre.ajouteFils(new Arbre("","and tt.mot "));
			}
		  a = VAR
			{ 
			lepar_arbre.ajouteFils(new Arbre(" = ", "'"+a.getText()+"'"));
			}
		
		| AUTEUR
			{
			lepar_arbre.ajouteFils(new Arbre("","and e.email "));
			}
		  a = VAR
			{ 
			lepar_arbre.ajouteFils(new Arbre("like ", "'\%"+a.getText()+"\%'"));
			}
		| RUBRIQUE
			{
			lepar_arbre.ajouteFils(new Arbre("","and tt.rubrique "));
			}
		   a = VAR
			{ 
			lepar_arbre.ajouteFils(new Arbre("like ", "'\%"+a.getText()+"\%'"));
			}
		| IMAGE
			{
			lepar_arbre.ajouteFils(new Arbre("","where image "));
			}
		  a = VAR
			{ 
			lepar_arbre.ajouteFils(new Arbre("= ", "'"+a.getText()+"'"));
			}
		| CONTACT
			{
			lepar_arbre.ajouteFils(new Arbre("","intersect select distinct d.fichier from public.email e where e.email "));
			}
		   a = VAR
			{ 
			lepar_arbre.ajouteFils(new Arbre("like ", "'\%"+a.getText()+"\%'"));
			}
		| DATE
			{
			lepar_arbre.ajouteFils(new Arbre("","intersect select distinct d.fichier from public.date d where "));
			}

		( b = ANNEE
			{
			lepar_arbre.ajouteFils(new Arbre("annee = "+"'"+b.getText()+"'"));
			}
		| c = MOIS
			{
			lepar_arbre.ajouteFils(new Arbre("mois = "+"'"+c.getText()+"'"));
			}
		| d = JOUR
			{
			lepar_arbre.ajouteFils(new Arbre("jour = "+"'"+d.getText()+"'"));
			}
			)
;
