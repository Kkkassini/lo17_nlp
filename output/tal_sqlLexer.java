// $ANTLR 3.5.1 D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g 2019-12-12 00:01:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g"; }

	// $ANTLR start "VOULOIR"
	public final void mVOULOIR() throws RecognitionException {
		try {
			int _type = VOULOIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:3:9: ( 'vouloir' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:3:11: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOULOIR"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:5:9: ( 'article' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:5:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:7:10: ( 'bulletin' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:7:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "IMAGE"
	public final void mIMAGE() throws RecognitionException {
		try {
			int _type = IMAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:9:7: ( 'image' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:9:8: 'image'
			{
			match("image"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMAGE"

	// $ANTLR start "CONTACT"
	public final void mCONTACT() throws RecognitionException {
		try {
			int _type = CONTACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:11:9: ( 'contact' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:11:11: 'contact'
			{
			match("contact"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTACT"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:13:8: ( 'nombre' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:13:9: 'nombre'
			{
			match("nombre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "ORDRE"
	public final void mORDRE() throws RecognitionException {
		try {
			int _type = ORDRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:15:7: ( 'premier' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:15:8: 'premier'
			{
			match("premier"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDRE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:17:8: ( 'auteur' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:17:10: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:19:9: ( 'rubrique' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:19:11: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:21:5: ( 'date' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:21:7: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "PERIODE"
	public final void mPERIODE() throws RecognitionException {
		try {
			int _type = PERIODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:24:9: ( 'mois' | 'annee' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='m') ) {
				alt1=1;
			}
			else if ( (LA1_0=='a') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:24:11: 'mois'
					{
					match("mois"); 

					}
					break;
				case 2 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:24:18: 'annee'
					{
					match("annee"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERIODE"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:27:5: ( 'mot' )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:27:7: 'mot'
			{
			match("mot"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' '||LA3_0=='d'||LA3_0=='j'||LA3_0=='q') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt2=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt2=1;
						}
						break;
					case '\t':
						{
						alt2=2;
						}
						break;
					case '\r':
						{
						alt2=3;
						}
						break;
					case 'j':
						{
						alt2=4;
						}
						break;
					case 'q':
						{
						alt2=5;
						}
						break;
					case 'd':
						{
						alt2=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:30:62: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:33:6: ( ( 'A' .. 'Z' | 'a' .. 'z' )+ )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:33:8: ( 'A' .. 'Z' | 'a' .. 'z' )+
			{
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:33:8: ( 'A' .. 'Z' | 'a' .. 'z' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:35:7: ( ( '1' | '2' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:35:9: ( '1' | '2' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '2') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:37:6: ( ( '1' | '2' | '3' ) ( '0' .. '9' ) )
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:37:8: ( '1' | '2' | '3' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '3') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:39:6: ( ( '0' ) ( '1' .. '9' ) | ( '1' ) ( '0' .. '2' ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( (LA5_0=='1') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:39:9: ( '0' ) ( '1' .. '9' )
					{
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:39:9: ( '0' )
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:39:10: '0'
					{
					match('0'); 
					}

					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:39:26: ( '1' ) ( '0' .. '2' )
					{
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:39:26: ( '1' )
					// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:39:27: '1'
					{
					match('1'); 
					}

					if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:8: ( VOULOIR | ARTICLE | BULLETIN | IMAGE | CONTACT | NOMBRE | ORDRE | AUTEUR | RUBRIQUE | DATE | PERIODE | MOT | WS | VAR | ANNEE | JOUR | MOIS )
		int alt6=17;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:10: VOULOIR
				{
				mVOULOIR(); 

				}
				break;
			case 2 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:18: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:26: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:35: IMAGE
				{
				mIMAGE(); 

				}
				break;
			case 5 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:41: CONTACT
				{
				mCONTACT(); 

				}
				break;
			case 6 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:49: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 7 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:56: ORDRE
				{
				mORDRE(); 

				}
				break;
			case 8 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:62: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 9 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:69: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 10 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:78: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:83: PERIODE
				{
				mPERIODE(); 

				}
				break;
			case 12 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:91: MOT
				{
				mMOT(); 

				}
				break;
			case 13 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:95: WS
				{
				mWS(); 

				}
				break;
			case 14 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:98: VAR
				{
				mVAR(); 

				}
				break;
			case 15 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:102: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 16 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:108: JOUR
				{
				mJOUR(); 

				}
				break;
			case 17 :
				// D:\\GI05\\LO17\\TP6_intermediaire-20191205T064650Z-001\\tal_sql.g:1:113: MOIS
				{
				mMOIS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\12\16\1\uffff\2\16\5\uffff\15\16\1\13\1\16\2\20\15\16\1\101\1"+
		"\13\1\uffff\12\16\1\114\1\13\1\115\1\uffff\3\16\1\115\1\16\1\122\4\16"+
		"\2\uffff\2\16\1\131\1\16\1\uffff\1\16\1\134\2\16\1\137\1\140\1\uffff\1"+
		"\16\1\142\1\uffff\1\143\1\16\2\uffff\1\145\2\uffff\1\146\2\uffff";
	static final String DFA6_eofS =
		"\147\uffff";
	static final String DFA6_minS =
		"\1\11\1\157\1\156\1\165\1\155\2\157\1\162\1\165\1\141\1\157\1\uffff\1"+
		"\145\1\165\1\uffff\1\60\2\uffff\1\60\1\165\2\164\1\156\1\154\1\141\1\156"+
		"\1\155\1\145\1\142\1\164\1\156\1\151\1\101\1\151\2\60\1\154\1\151\2\145"+
		"\1\154\1\147\1\164\1\142\1\155\1\162\1\145\1\164\1\163\2\101\1\uffff\1"+
		"\157\1\143\1\165\3\145\1\141\1\162\2\151\3\101\1\uffff\1\151\1\154\1\162"+
		"\1\101\1\164\1\101\1\143\2\145\1\161\2\uffff\1\162\1\145\1\101\1\151\1"+
		"\uffff\1\164\1\101\1\162\1\165\2\101\1\uffff\1\156\1\101\1\uffff\1\101"+
		"\1\145\2\uffff\1\101\2\uffff\1\101\2\uffff";
	static final String DFA6_maxS =
		"\1\172\1\157\2\165\1\155\2\157\1\162\1\165\2\157\1\uffff\1\145\1\165\1"+
		"\uffff\1\71\2\uffff\1\71\1\165\2\164\1\156\1\154\1\141\1\156\1\155\1\145"+
		"\1\142\1\164\1\156\1\164\1\172\1\151\2\71\1\154\1\151\2\145\1\154\1\147"+
		"\1\164\1\142\1\155\1\162\1\145\1\164\1\163\2\172\1\uffff\1\157\1\143\1"+
		"\165\3\145\1\141\1\162\2\151\3\172\1\uffff\1\151\1\154\1\162\1\172\1\164"+
		"\1\172\1\143\2\145\1\161\2\uffff\1\162\1\145\1\172\1\151\1\uffff\1\164"+
		"\1\172\1\162\1\165\2\172\1\uffff\1\156\1\172\1\uffff\1\172\1\145\2\uffff"+
		"\1\172\2\uffff\1\172\2\uffff";
	static final String DFA6_acceptS =
		"\13\uffff\1\15\2\uffff\1\16\1\uffff\1\20\1\21\41\uffff\1\17\15\uffff\1"+
		"\14\12\uffff\1\12\1\13\4\uffff\1\4\6\uffff\1\10\2\uffff\1\6\2\uffff\1"+
		"\1\1\2\1\uffff\1\5\1\7\1\uffff\1\3\1\11";
	static final String DFA6_specialS =
		"\147\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\17\uffff\1\21\1\17\1\22\1\20\15\uffff"+
			"\32\16\6\uffff\1\2\1\3\1\5\1\11\4\16\1\4\1\14\2\16\1\12\1\6\1\16\1\7"+
			"\1\15\1\10\3\16\1\1\4\16",
			"\1\23",
			"\1\26\3\uffff\1\24\2\uffff\1\25",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35\15\uffff\1\36",
			"\1\37",
			"",
			"\1\40",
			"\1\41",
			"",
			"\3\42\7\43",
			"",
			"",
			"\12\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60\12\uffff\1\61",
			"\32\16\6\uffff\32\16",
			"\1\62",
			"\12\63",
			"\12\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"",
			"\1\116",
			"\1\117",
			"\1\120",
			"\32\16\6\uffff\32\16",
			"\1\121",
			"\32\16\6\uffff\32\16",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"",
			"\1\127",
			"\1\130",
			"\32\16\6\uffff\32\16",
			"\1\132",
			"",
			"\1\133",
			"\32\16\6\uffff\32\16",
			"\1\135",
			"\1\136",
			"\32\16\6\uffff\32\16",
			"\32\16\6\uffff\32\16",
			"",
			"\1\141",
			"\32\16\6\uffff\32\16",
			"",
			"\32\16\6\uffff\32\16",
			"\1\144",
			"",
			"",
			"\32\16\6\uffff\32\16",
			"",
			"",
			"\32\16\6\uffff\32\16",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( VOULOIR | ARTICLE | BULLETIN | IMAGE | CONTACT | NOMBRE | ORDRE | AUTEUR | RUBRIQUE | DATE | PERIODE | MOT | WS | VAR | ANNEE | JOUR | MOIS );";
		}
	}

}
