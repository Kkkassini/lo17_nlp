grammar tal_inter;

VOULOIR : 'vouloir' |  'afficher'|'rechercher'
;
ARTICLE : 'article'
;
LEMME : ('A'..'Z' | 'a'..'z') ('a'..'z')+
;
POINT: '.'
;
listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}:
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new_Arbre("")]
	@init {Arbre ps_arbre;} : 
	VOULOIR 
		{
			req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
		} 
	ARTICLE 
		{
			req_arbre.ajouteFils(new Arbre("","ARTICLE"));
		} 
	l=LEMME 
		{
			req_arbre.ajouteFils(new Arbre("",l.getText()));
			req = req_arbre.sortArbre();
		} 
				
;

