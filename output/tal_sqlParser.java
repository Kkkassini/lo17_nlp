// $ANTLR 3.5.1 D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g 2019-12-12 00:01:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "AUTEUR", 
		"BULLETIN", "CONTACT", "DATE", "IMAGE", "JOUR", "MOIS", "MOT", "NOMBRE", 
		"ORDRE", "PERIODE", "RUBRIQUE", "VAR", "VOULOIR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int BULLETIN=7;
	public static final int CONTACT=8;
	public static final int DATE=9;
	public static final int IMAGE=10;
	public static final int JOUR=11;
	public static final int MOIS=12;
	public static final int MOT=13;
	public static final int NOMBRE=14;
	public static final int ORDRE=15;
	public static final int PERIODE=16;
	public static final int RUBRIQUE=17;
	public static final int VAR=18;
	public static final int VOULOIR=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:43:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre, par_arbre;
		try {
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:44:36: (r= requete )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:45:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes258);
			r=requete();
			state._fsp--;


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:53:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : VOULOIR ob= objet ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ob =null;
		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:54:26: ( VOULOIR ob= objet ps= params )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:55:3: VOULOIR ob= objet ps= params
			{
			match(input,VOULOIR,FOLLOW_VOULOIR_in_requete289); 

							req_arbre.ajouteFils(new Arbre("","select distinct "));
						
			pushFollow(FOLLOW_objet_in_requete308);
			ob=objet();
			state._fsp--;


							ps_arbre = ob;
							req_arbre.ajouteFils(ps_arbre);
						
			pushFollow(FOLLOW_params_in_requete324);
			ps=params();
			state._fsp--;


							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "objet"
	// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:136:1: objet returns [Arbre obj_arbre = new Arbre(\"\")] : ( ( NOMBRE )? ( ARTICLE | BULLETIN ) | AUTEUR | RUBRIQUE | IMAGE | CONTACT | DATE ) ;
	public final Arbre objet() throws RecognitionException {
		Arbre obj_arbre =  new Arbre("");


		Arbre obj1_arbre;
		try {
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:137:28: ( ( ( NOMBRE )? ( ARTICLE | BULLETIN ) | AUTEUR | RUBRIQUE | IMAGE | CONTACT | DATE ) )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:143:3: ( ( NOMBRE )? ( ARTICLE | BULLETIN ) | AUTEUR | RUBRIQUE | IMAGE | CONTACT | DATE )
			{
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:143:3: ( ( NOMBRE )? ( ARTICLE | BULLETIN ) | AUTEUR | RUBRIQUE | IMAGE | CONTACT | DATE )
			int alt3=6;
			switch ( input.LA(1) ) {
			case ARTICLE:
			case BULLETIN:
			case NOMBRE:
				{
				alt3=1;
				}
				break;
			case AUTEUR:
				{
				alt3=2;
				}
				break;
			case RUBRIQUE:
				{
				alt3=3;
				}
				break;
			case IMAGE:
				{
				alt3=4;
				}
				break;
			case CONTACT:
				{
				alt3=5;
				}
				break;
			case DATE:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:143:4: ( NOMBRE )? ( ARTICLE | BULLETIN )
					{
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:143:4: ( NOMBRE )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==NOMBRE) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:143:5: NOMBRE
							{
							match(input,NOMBRE,FOLLOW_NOMBRE_in_objet370); 

										obj_arbre.ajouteFils(new Arbre("","count "));
										
							}
							break;

					}

					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:147:5: ( ARTICLE | BULLETIN )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ARTICLE) ) {
						alt2=1;
					}
					else if ( (LA2_0==BULLETIN) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:147:6: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_objet384); 

										obj_arbre.ajouteFils(new Arbre("","fichier "));
										obj_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
										
							}
							break;
						case 2 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:153:6: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_objet399); 

										obj_arbre.ajouteFils(new Arbre("","numero "));
										obj_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
										
							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:158:5: AUTEUR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_objet411); 

								obj_arbre.ajouteFils(new Arbre("","auteur,"));
								
					}
					break;
				case 3 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:162:5: RUBRIQUE
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_objet422); 

								obj_arbre.ajouteFils(new Arbre("","rubrique,"));
								
					}
					break;
				case 4 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:166:5: IMAGE
					{
					match(input,IMAGE,FOLLOW_IMAGE_in_objet433); 

								obj_arbre.ajouteFils(new Arbre("","image,"));
								
					}
					break;
				case 5 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:170:5: CONTACT
					{
					match(input,CONTACT,FOLLOW_CONTACT_in_objet444); 

								obj_arbre.ajouteFils(new Arbre("","email,"));
								
					}
					break;
				case 6 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:174:5: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_objet455); 

								obj_arbre.ajouteFils(new Arbre("","jour,mois,annee from public.date d where"));
								
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj_arbre;
	}
	// $ANTLR end "objet"



	// $ANTLR start "params"
	// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:180:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= parambegin ( (par2= param )+ )? ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;String p;
		try {
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:181:49: (par1= parambegin ( (par2= param )+ )? )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:183:3: par1= parambegin ( (par2= param )+ )?
			{
			pushFollow(FOLLOW_parambegin_in_params492);
			par1=parambegin();
			state._fsp--;


							par1_arbre = par1;
							//les_pars_arbre.ajouteFils(new Arbre("", "evénement"));
							les_pars_arbre.ajouteFils(par1_arbre);
							
							les_pars_arbre.ajouteFils(new Arbre(""));
						
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:191:3: ( (par2= param )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= ARTICLE && LA5_0 <= AUTEUR)||(LA5_0 >= CONTACT && LA5_0 <= IMAGE)||(LA5_0 >= RUBRIQUE && LA5_0 <= VAR)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:191:4: (par2= param )+
					{
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:191:4: (par2= param )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= ARTICLE && LA4_0 <= AUTEUR)||(LA4_0 >= CONTACT && LA4_0 <= IMAGE)||(LA4_0 >= RUBRIQUE && LA4_0 <= VAR)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:191:6: par2= param
							{
							pushFollow(FOLLOW_param_in_params509);
							par2=param();
							state._fsp--;


											par2_arbre = par2;
											//les_pars_arbre.ajouteFils(new Arbre("", "2OR"));
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "parambegin"
	// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:200:1: parambegin returns [Arbre parb_arbre = new Arbre(\"\")] : ( MOT a= VAR | ARTICLE a= VAR | AUTEUR a= VAR | RUBRIQUE a= VAR | IMAGE a= VAR | CONTACT a= VAR | DATE (b= ANNEE |c= MOIS |d= JOUR ) );
	public final Arbre parambegin() throws RecognitionException {
		Arbre parb_arbre =  new Arbre("");


		Token a=null;
		Token b=null;
		Token c=null;
		Token d=null;

		String t = "mot";String p = "=";
		try {
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:201:43: ( MOT a= VAR | ARTICLE a= VAR | AUTEUR a= VAR | RUBRIQUE a= VAR | IMAGE a= VAR | CONTACT a= VAR | DATE (b= ANNEE |c= MOIS |d= JOUR ) )
			int alt7=7;
			switch ( input.LA(1) ) {
			case MOT:
				{
				alt7=1;
				}
				break;
			case ARTICLE:
				{
				alt7=2;
				}
				break;
			case AUTEUR:
				{
				alt7=3;
				}
				break;
			case RUBRIQUE:
				{
				alt7=4;
				}
				break;
			case IMAGE:
				{
				alt7=5;
				}
				break;
			case CONTACT:
				{
				alt7=6;
				}
				break;
			case DATE:
				{
				alt7=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:203:3: MOT a= VAR
					{
					match(input,MOT,FOLLOW_MOT_in_parambegin546); 

									//req_arbre.ajouteFils(new Arbre("","from "));
									parb_arbre.ajouteFils(new Arbre("","where "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_parambegin561); 
					 
								parb_arbre.ajouteFils(new Arbre("tt.mot = ", "'"+a.getText()+"'"));
								
					}
					break;
				case 2 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:213:4: ARTICLE a= VAR
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_parambegin574); 

									//req_arbre.ajouteFils(new Arbre("","from "));
									parb_arbre.ajouteFils(new Arbre("","where tt.mot "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_parambegin589); 
					 
								parb_arbre.ajouteFils(new Arbre(" = ", "'"+a.getText()+"'"));
								
					}
					break;
				case 3 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:223:5: AUTEUR a= VAR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_parambegin603); 

								parb_arbre.ajouteFils(new Arbre("",",public.email e where e.email "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_parambegin618); 
					 
								parb_arbre.ajouteFils(new Arbre("like ", "'%"+a.getText()+"%'"));
								
					}
					break;
				case 4 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:231:5: RUBRIQUE a= VAR
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_parambegin629); 

								parb_arbre.ajouteFils(new Arbre("","where rubrique "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_parambegin645); 
					 
								parb_arbre.ajouteFils(new Arbre("like ", "'%"+a.getText()+"%'"));
								
					}
					break;
				case 5 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:239:5: IMAGE a= VAR
					{
					match(input,IMAGE,FOLLOW_IMAGE_in_parambegin656); 

								parb_arbre.ajouteFils(new Arbre("","where image "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_parambegin671); 
					 
								parb_arbre.ajouteFils(new Arbre("= ", "'"+a.getText()+"'"));
								
					}
					break;
				case 6 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:247:5: CONTACT a= VAR
					{
					match(input,CONTACT,FOLLOW_CONTACT_in_parambegin682); 

								parb_arbre.ajouteFils(new Arbre("","public.email e where e.email "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_parambegin698); 
					 
								parb_arbre.ajouteFils(new Arbre("like ", "'%"+a.getText()+"%'"));
								
					}
					break;
				case 7 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:255:5: DATE (b= ANNEE |c= MOIS |d= JOUR )
					{
					match(input,DATE,FOLLOW_DATE_in_parambegin709); 

								parb_arbre.ajouteFils(new Arbre("","public.date d where e.email "));
								
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:260:3: (b= ANNEE |c= MOIS |d= JOUR )
					int alt6=3;
					switch ( input.LA(1) ) {
					case ANNEE:
						{
						alt6=1;
						}
						break;
					case MOIS:
						{
						alt6=2;
						}
						break;
					case JOUR:
						{
						alt6=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:260:5: b= ANNEE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_parambegin725); 

										parb_arbre.ajouteFils(new Arbre("from public.date where annee"+"'"+b.getText()+"'"));
										
							}
							break;
						case 2 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:264:5: c= MOIS
							{
							c=(Token)match(input,MOIS,FOLLOW_MOIS_in_parambegin740); 

										parb_arbre.ajouteFils(new Arbre("from public.date where moi"+"'"+c.getText()+"'"));
										
							}
							break;
						case 3 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:268:5: d= JOUR
							{
							d=(Token)match(input,JOUR,FOLLOW_JOUR_in_parambegin755); 

										parb_arbre.ajouteFils(new Arbre("from public.date where jour"+"'"+d.getText()+"'"));
										
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return parb_arbre;
	}
	// $ANTLR end "parambegin"



	// $ANTLR start "param"
	// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:277:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | ARTICLE a= VAR | AUTEUR a= VAR | RUBRIQUE a= VAR | IMAGE a= VAR | CONTACT a= VAR | DATE (b= ANNEE |c= MOIS |d= JOUR ) );
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;
		Token b=null;
		Token c=null;
		Token d=null;

		Arbre par0_arbre;String t = "mot";
		try {
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:278:45: (a= VAR | ARTICLE a= VAR | AUTEUR a= VAR | RUBRIQUE a= VAR | IMAGE a= VAR | CONTACT a= VAR | DATE (b= ANNEE |c= MOIS |d= JOUR ) )
			int alt9=7;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt9=1;
				}
				break;
			case ARTICLE:
				{
				alt9=2;
				}
				break;
			case AUTEUR:
				{
				alt9=3;
				}
				break;
			case RUBRIQUE:
				{
				alt9=4;
				}
				break;
			case IMAGE:
				{
				alt9=5;
				}
				break;
			case CONTACT:
				{
				alt9=6;
				}
				break;
			case DATE:
				{
				alt9=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:279:5: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param795); 
					 
								lepar_arbre.ajouteFils(new Arbre("intersect select distinct tt.fichier from public.titretexte tt where tt.mot = ", "'"+a.getText()+"'"));
								
					}
					break;
				case 2 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:284:4: ARTICLE a= VAR
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_param808); 

								//req_arbre.ajouteFils(new Arbre("","from "));
								lepar_arbre.ajouteFils(new Arbre("","and tt.mot "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param823); 
					 
								lepar_arbre.ajouteFils(new Arbre(" = ", "'"+a.getText()+"'"));
								
					}
					break;
				case 3 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:294:5: AUTEUR a= VAR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_param837); 

								lepar_arbre.ajouteFils(new Arbre("","and e.email "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param852); 
					 
								lepar_arbre.ajouteFils(new Arbre("like ", "'%"+a.getText()+"%'"));
								
					}
					break;
				case 4 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:302:5: RUBRIQUE a= VAR
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_param863); 

								lepar_arbre.ajouteFils(new Arbre("","and tt.rubrique "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param879); 
					 
								lepar_arbre.ajouteFils(new Arbre("like ", "'%"+a.getText()+"%'"));
								
					}
					break;
				case 5 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:310:5: IMAGE a= VAR
					{
					match(input,IMAGE,FOLLOW_IMAGE_in_param890); 

								lepar_arbre.ajouteFils(new Arbre("","where image "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param905); 
					 
								lepar_arbre.ajouteFils(new Arbre("= ", "'"+a.getText()+"'"));
								
					}
					break;
				case 6 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:318:5: CONTACT a= VAR
					{
					match(input,CONTACT,FOLLOW_CONTACT_in_param916); 

								lepar_arbre.ajouteFils(new Arbre("","intersect select distinct d.fichier from public.email e where e.email "));
								
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param932); 
					 
								lepar_arbre.ajouteFils(new Arbre("like ", "'%"+a.getText()+"%'"));
								
					}
					break;
				case 7 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:326:5: DATE (b= ANNEE |c= MOIS |d= JOUR )
					{
					match(input,DATE,FOLLOW_DATE_in_param943); 

								lepar_arbre.ajouteFils(new Arbre("","intersect select distinct d.fichier from public.date d where "));
								
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:331:3: (b= ANNEE |c= MOIS |d= JOUR )
					int alt8=3;
					switch ( input.LA(1) ) {
					case ANNEE:
						{
						alt8=1;
						}
						break;
					case MOIS:
						{
						alt8=2;
						}
						break;
					case JOUR:
						{
						alt8=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:331:5: b= ANNEE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_param959); 

										lepar_arbre.ajouteFils(new Arbre("annee = "+"'"+b.getText()+"'"));
										
							}
							break;
						case 2 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:335:5: c= MOIS
							{
							c=(Token)match(input,MOIS,FOLLOW_MOIS_in_param974); 

										lepar_arbre.ajouteFils(new Arbre("mois = "+"'"+c.getText()+"'"));
										
							}
							break;
						case 3 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:339:5: d= JOUR
							{
							d=(Token)match(input,JOUR,FOLLOW_JOUR_in_param989); 

										lepar_arbre.ajouteFils(new Arbre("jour = "+"'"+d.getText()+"'"));
										
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOULOIR_in_requete289 = new BitSet(new long[]{0x00000000000247E0L});
	public static final BitSet FOLLOW_objet_in_requete308 = new BitSet(new long[]{0x0000000000022760L});
	public static final BitSet FOLLOW_params_in_requete324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_objet370 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_ARTICLE_in_objet384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_objet399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_objet411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_objet422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMAGE_in_objet433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTACT_in_objet444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_objet455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parambegin_in_params492 = new BitSet(new long[]{0x0000000000060762L});
	public static final BitSet FOLLOW_param_in_params509 = new BitSet(new long[]{0x0000000000060762L});
	public static final BitSet FOLLOW_MOT_in_parambegin546 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_parambegin561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_parambegin574 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_parambegin589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_parambegin603 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_parambegin618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_parambegin629 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_parambegin645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMAGE_in_parambegin656 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_parambegin671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTACT_in_parambegin682 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_parambegin698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_parambegin709 = new BitSet(new long[]{0x0000000000001810L});
	public static final BitSet FOLLOW_ANNEE_in_parambegin725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_parambegin740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_parambegin755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_param808 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_param823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_param837 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_param852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_param863 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_param879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMAGE_in_param890 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_param905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTACT_in_param916 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_in_param932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_param943 = new BitSet(new long[]{0x0000000000001810L});
	public static final BitSet FOLLOW_ANNEE_in_param959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param989 = new BitSet(new long[]{0x0000000000000002L});
}
