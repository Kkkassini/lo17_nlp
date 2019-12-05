// $ANTLR 3.5.1 /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g 2019-11-14 13:41:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_interParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "LEMME", "POINT", "VOULOIR"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int LEMME=5;
	public static final int POINT=6;
	public static final int VOULOIR=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_interParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_interParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_interParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g"; }



	// $ANTLR start "listerequetes"
	// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:11:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:12:25: (r= requete POINT )
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:13:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes80);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes82); 

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
	// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:20:1: requete returns [Arbre req_arbre = new_Arbre(\"\")] : VOULOIR ARTICLE l= LEMME ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");
		String req = "";

		Token l=null;

		Arbre ps_arbre;
		try {
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:21:26: ( VOULOIR ARTICLE l= LEMME )
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:22:2: VOULOIR ARTICLE l= LEMME
			{
			match(input,VOULOIR,FOLLOW_VOULOIR_in_requete108); 

						req_arbre.ajouteFils(new Arbre("","SELECT DISTINCT"));
					
			match(input,ARTICLE,FOLLOW_ARTICLE_in_requete117); 

						req_arbre.ajouteFils(new Arbre("","ARTICLE"));
					
			l=(Token)match(input,LEMME,FOLLOW_LEMME_in_requete128); 

						req_arbre.ajouteFils(new Arbre("",l.getText()));
						req = req_arbre.sortArbre();
					
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

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes80 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_POINT_in_listerequetes82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOULOIR_in_requete108 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete117 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_LEMME_in_requete128 = new BitSet(new long[]{0x0000000000000002L});
}
