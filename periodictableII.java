

package major_assignmentII;

import java.io.*;

public class periodictableII {
	
	
	
		int i;
	        String ename[]={"Hydrogen","Helium",
	                       "Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon",
	                       "Sodium","Magnesium","Aluminium","Silicon","Phosphorus","Sulphur","Chlorine","Argon",
	                       "Potassium","Calcium","Scandium","Titanium","Vanadium","Chromium","Manganese","Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine","Krypton",
	                       "Rubidium","Strontium","Yttrium","Zirconium","Niobium","Molybdenum","Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon",
	                       "Cesium","Barium","Lanthanum","Cerium","Praseodymium","Neodymium","Promethium","Samarium","Europium","Gadolinium","Terbium","Dysprosium","Holmium","Erbium","Thulium","Ytterbium","Lutenium","Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead","Bismuth","Polonium","Astatine","Radon",
	                       "Francium","Radium","Actinium","Thorium","Protactinium","Uranium","Neptunium","Plutonium","Americium","Curium","Berkelium","Californium","Einteinium","Fermium","Un-nil-unium","Un-nil-bium","Un-nil-trium","Un-nil-quadium","Un-nil-pentium","Un-nil-hexium","Un-nil-septium","Un-nil-octium","Un-nil-enium","Un-un-nilium","Un-un-unium","Un-un-bium","Un-un-trium","Un-un-quadium","Un-un-pentium","Un-un-hexium","Un-un-septium","Un-un-octium"};
		String symbol[]={"H","He",
	                         "Li","Be","B","C","N","O","F","Ne",
	                         "Na","Mg","Al","Si","P","S","Cl","Ar",
	                         "K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr",
	                         "Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe",
	                         "Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn",
	                         "Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Unu","Unb","Unt","Unq","Unp","Unh","Uns","Uno","Une","Uun","Uuu","Uub","Uut","Uuq","Uup","Uuh","Uus","Uuo"};
		String group[]={"I-A","Zero",
	                        "I-A","II-A","III-A","IV-A","V-A","VI-A","VII-A","Zero",
	                        "I-A","II-A","III-A","IV-A","V-A","VI-A","VII-A","Zero",
	                        "I-A","II-A","III-B","IV-B","V-B","VI-B","VII-B","VIII","VIII","VIII","I-B","II-B","III-A","IV-A","V-A","VI-A","VII-A","Zero",
	                        "I-A","II-A","III-B","IV-B","V-B","VI-B","VII-B","VIII","VIII","VIII","I-B","II-B","III-A","IV-A","V-A","VI-A","VII-A","Zero",
				"I-A","II-A",
				"III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B",
				"IV-B","V-B","VI-B","VII-B","VIII","VIII","VIII","I-B","II-B","III-A","IV-A","V-A","VI-A","VII-A","Zero",
				"I-A","II-A",
				"III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B","III-B",
				"IV-B","V-B","VI-B","VII-B","VIII","VIII","VIII","I-B","II-B","III-A","IV-A","V-A","VI-A","VII-A","Zero"};
		int period[]={1,1,
	                      2,2,2,2,2,2,2,2,
	                      3,3,3,3,3,3,3,3,
	                      4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,
	                      5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
	                      6,6,
	                      6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,
	                      6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,
	                      7,7,
	                      7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,
	                      7,7,7,7,7,7,7,7,7,7,7,7,7,7,7};     
	        int atno[]={1,2,3,4,5,6,7,8,9,10,
			    11,12,13,14,15,16,17,18,
			    19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,
			    37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,
			    55,56,
			    57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,
			    72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,
			    87,88,
			    89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,
			    104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
		int pro[]={1,2,3,4,5,6,7,8,9,10,
			   11,12,13,14,15,16,17,18,
			   19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,
			   37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,
			   55,56,
			   57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,
			   72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,
			   87,88,
			   89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,
			   104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
		int elec[]={1,2,3,4,5,6,7,8,9,10,
			    11,12,13,14,15,16,17,18,
			    19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,
			    37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,
			    55,56,
			    57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,
			    72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,
			    87,88,
			    89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,
			    104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
		int neu[]={0,2,
			   4,5,6,6,7,8,10,10,
			   12,12,14,14,16,16,18,22,
			   20,20,24,26,28,28,30,30,32,31,34,35,39,41,42,45,45,48,
			   48,50,50,51,52,54,56,57,58,60,61,64,66,69,71,76,74,77,
			   78,81,
			   82,82,82,84,84,88,89,93,94,96,98,99,100,103,104,
			   106,108,110,111,114,115,117,118,121,123,125,126,125,125,136,
			   136,138,
			   138,142,140,146,144,150,148,151,150,153,155,157,157,157,157,
			   157,157,157,155,157,158,159,161,165,0,184,0,0,0,175};
		double atwt[ ]={1,4,
	                       7,9,11,12,14,16,19,20,
	                       23,24,27,28,31,32,35.5,40,
	                       39,40,45,48,51,52,55,56,58.9,58.6,63.5,65,70,73,75,79,80,84,
	                       85.5,88,89,91,93,96,99,101,103,106.5,108,112.5,115,119,122,127.5,126,9,131,
	                       133,137,
	                       139,140,141,144,145,150.5,152,157,159,162.5,165,167,169,173,175,
	                       178.5,181,184,186,190,192,195,197,201,204,207,208.9,209,210,222, 
	                       223,226,
	                       227,232,231,238,237,244,243,247,247,251,254,257,258,259,260,
	                       261,262,263,262,265,267,269,272,277,0,298,0,0,0,293}; 
		String type[]={"Non-Metal","Inert Gas","Alkali Metal","Alkaline Earth Metal","Semi-Metal","Non-Metal","Non-Metal","Non-Metal","Non-Metal","Inert Gas",
	                       "Alkali Metal","Alkaline Earth Metal","Poor Metal","Semi-Metal","Non-Metal","Non-Metal","Non-Metal","Inert Gas",
	                       "Alkali Metal","Alkaline Earth Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal",
	                       "Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Poor Metal","Semi-Metal","Semi-Metal",
	                       "Semi-Metal","Non-Metal","Inert Gas",
	                       "Alkali Metal","Alkaline Earth Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal",
	                       "Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Poor Metal","Poor Metal","Semi-Metal",
	                       "Semi-Metal","Non-Metal","Inert Gas",
	                       "Alkali Metal","Alkaline Earth Metal",
	                       "Lanthanide","Lanthanide","Lanthanide","Lanthanide","Lanthanide","Lanthanide","Lanthanide","Lanthanide","Lanthanide","Lanthanide",
	                       "Lanthanide","Lanthanide","Lanthanide","Lanthanide","Lanthanide",
	                       "Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal",
	                       "Transition Metal","Transition Metal","Poor Metal","Poor Metal","Poor Metal","Poor Metal","Non-Metal","Inert Gas",
	                       "Alkali Metal","Alkaline Earth Metal",
	                       "Actinide","Actinide","Actinide","Actinide","Actinide","Actinide","Actinide","Actinide","Actinide","Actinide","Actinide","Actinide",
	                       "Actinide","Actinide","Actinide",
	                       "Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal",
	                       "Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal","Transition Metal",};
		
		int viewSymbol(String x1)
		{
			for(i=0;i<118;i++)
			{
				if(x1.equalsIgnoreCase(ename[i]))
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase()+" HAS THE SYMBOL: "+symbol[i]);
	                                return 1;
				}
			}
	                System.out.print("\t\tINVALID ENTRY.......");
			return 0;
		}
		
		int viewAtno(String x2)
		{
			for(i=0;i<118;i++)
			{
				if(x2.equalsIgnoreCase(ename[i]))
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase()+" HAS AN ATOMIC NUMBER: "+atno[i]);
					return 1;
				}
			}
	                System.out.println("\t\tINVALID ENTRY.......");
			return 0;
		}
		
		int viewAtwt(String x3)
		{
	                for(i=0;i<118;i++)
			{
				if(x3.equalsIgnoreCase(ename[i]))
				{ 
	                                if(atwt[i]!=0)
	                                {
	                                        System.out.println("\t\t"+ename[i].toUpperCase()+" HAS AN ATOMIC WEIGHT: "+atwt[i]);
	                                        return 1;
	                                }
	                                else if(atwt[i]==0)
	                                {
	                                        System.out.println("\t\tTHE ATOMIC WEIGHT OF "+ename[i].toUpperCase()+" IS UNKNOWN.");
	                                        return 1;
	                                }
	                        }
			}
	                System.out.println("\t\tINVALID ENTRY..........");
			return 0;
		}
	        
		int viewSubatm(String x4)
		{
	                for(i=0;i<118;i++)
			{
				if(x4.equalsIgnoreCase(ename[i]))
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase());
	                                System.out.println("\t\tPROTONS: "+pro[i]);
	                                System.out.println("\t\tELECTRONS: "+elec[i]);
	                                if(neu[i]!=0 || i==0)
	                                        System.out.println("\t\tNEUTRONS: "+neu[i]);
	                                else
	                                        System.out.println("\t\tNEUTRONS: UNKNOWN.");
					return 1;
				}
			}
	                System.out.println("\t\tINVALID ENTRY........");
			return 0;
		}

		int viewType(String x5)
		{
	                for(i=0;i<118;i++)
			{
				if(x5.equalsIgnoreCase(ename[i]))
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase()+" IS A/AN "+type[i].toUpperCase());
					return 1;
				}
			}
	                System.out.println("\t\tINVALID ENTRY........");
			return 0;
		}

		int viewPosition(String x6)
		{
	                for(i=0;i<118;i++)
			{
				if(x6.equalsIgnoreCase(ename[i]))
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase()+" BELONGS TO:");
	                                System.out.println("\t\tPERIOD: "+period[i]);
	                                System.out.println("\t\t GROUP: "+group[i]);
					return 1;
				}
			}
	                System.out.println("\t\tINVALID ENTRY........");
			return 0;
		}
		
		int viewElement(String x7)
		{
	                for(i=0;i<118;i++)
			{
				if(x7.equals(symbol[i]))
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase());
					return 1;
				}
			}
	                System.out.println("\t\tINVALID ENTRY........");
			return 0;
		}

	        void viewPeriod(int x8)throws IOException
		{
	                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	                int fr=0;
	                System.out.println("\n\nPERIOD "+x8+" HAS THE FOLLOWING ELEMENTS.");
	                for(i=0;i<118;i++)
			{
				if(x8==period[i])
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase());
	                                fr++;
	                                if(fr==20)
	                                {
	                                        System.out.print("\t\tPRESS ENTER TO CONTINUE:");
	                                        br.readLine();
	                                }
				}
			}
	                if(fr==0)
	                        System.out.println("\t\tINVALID ENTRY........");
	        }

		void viewGroup(String x9)
	        {       int fv=0;
	                System.out.println("\n\nGROUP "+x9+" HAS THE FOLLOWING ELEMENTS.");
	                
	                for(i=0;i<118;i++)
			{
				if(x9.equalsIgnoreCase(group[i]))
				{
	                                System.out.println("\t\t"+ename[i].toUpperCase());
	                                fv++;
				}
			}
	                if(fv==0)
	                        System.out.println("\t\tINVALID ENTRY........");
	        }

	        public static void main(String ar[])throws IOException
	        {
	                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	                int as;
	                int option;
	                System.out.println("PLEASE WAIT WHILE YOUR REQUEST IS BEING PROCESSED.");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                System.out.print("LOADING");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                        System.out.print(".");
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);
	                for(as=0;as<20000000;as++);                                                                  
	                        System.out.print(".");
	                do
			{
	                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	                        System.out.println("ÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛ");
	                        System.out.println("ÛÛÛ                                                                         ÛÛÛ");
	                        System.out.println("ÛÛÛ                 WELCOME TO THE MODERN PERIODIC TABLE                    ÛÛÛ");
	                        System.out.println("ÛÛÛ                ÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄ                   ÛÛÛ");
	                        System.out.println("ÛÛÛ                CHOOSE ANY ONE OF THE FOLLOWING OPTIONS:                 ÛÛÛ");
	                        System.out.println("ÛÛÛ                                                                         ÛÛÛ");
	                        System.out.println("ÛÛÛ                 1.ELEMENT                                               ÛÛÛ");
	                        System.out.println("ÛÛÛ                 2.SYMBOL                                                ÛÛÛ");
	                        System.out.println("ÛÛÛ                 3.PERIOD                                                ÛÛÛ");
	                        System.out.println("ÛÛÛ                 4.GROUP                                                 ÛÛÛ");
	                        System.out.println("ÛÛÛ                 5.VIEW THE MODERN PERIODIC TABLE                        ÛÛÛ");
	                        System.out.println("ÛÛÛ                 6.EXIT                                                  ÛÛÛ");
	                        System.out.println("ÛÛÛ                                                                         ÛÛÛ");
	                        System.out.println("ÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛÛ");
	                        System.out.print("                   PLEASE ENTER YOUR CHOICE: ");
	                        option=Integer.parseInt(br.readLine());
				System.out.println();
				
				switch(option){
	                                case 1:
					       int op1;
					       do
						{
	                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	                                                System.out.println("ÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜ");
	                                                System.out.println("Û                                                                            Û");
	                                                System.out.println("Û                          ELEMENT DETAILS                                   Û");
	                                                System.out.println("Û                         ÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄ                                  Û");
	                                                System.out.println("Û                                                                            Û");
	                                                System.out.println("Û                           1.SYMBOL                                         Û");
	                                                System.out.println("Û                           2.ATOMIC NUMBER                                  Û");
	                                                System.out.println("Û                           3.ATOMIC WEIGHT                                  Û");
	                                                System.out.println("Û                           4.SUB-ATOMIC PARTICLES                           Û");
	                                                System.out.println("Û                           5.TYPE                                           Û");
	                                                System.out.println("Û                           6.POSITION IN PERIODIC TABLE                     Û");
	                                                System.out.println("Û                           7.BACK TO PEIRODIC TABLE                         Û");
	                                                System.out.println("Û                                                                            Û");
	                                                System.out.println("ßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßß");
	                                                System.out.print("\t\t\t PLEASE ENTER YOUR CHOICE: ");
							op1=Integer.parseInt(br.readLine());
							System.out.println();
				
							switch(op1){
								case 1:
	                                                               System.out.print("\t ENTER ELEMENT NAME: ");
								       String s1=br.readLine();
								       periodictableII ob1=new periodictableII();
	                                                               ob1.viewSymbol(s1);
	                                                               System.out.print("\n\t PRESS ENTER TO CONTINUE...");
	                                                               br.readLine();
	                                                               break;
								case 2:
	                                                               System.out.print("\t ENTER ELEMENT NAME: ");
								       String s2=br.readLine();
								       periodictableII ob2=new periodictableII();
								       ob2.viewAtno(s2);
	                                                               System.out.print("\t PRESS ENTER TO CONTINUE...");
	                                                               br.readLine();
	                                                               break;
								case 3:
	                                                               System.out.print("\t ENTER ELEMENT NAME: ");
								       String s3=br.readLine();
								       periodictableII ob3=new periodictableII();
								       ob3.viewAtwt(s3);
	                                                               System.out.print("\t PRESS ENTER TO CONTINUE...");
	                                                               br.readLine();
								       break;
								case 4:
	                                                               System.out.print("\t ENTER ELEMENT NAME: ");
								       String s4=br.readLine();
								       periodictableII ob4=new periodictableII();
	                                                               ob4.viewSubatm(s4);
	                                                               System.out.print("\t PRESS ENTER TO CONTINUE...");
	                                                               br.readLine();
								       break;
								case 5:
	                                                               System.out.print("\t ENTER ELEMENT NAME: ");
								       String s5=br.readLine();
								       periodictableII ob5=new periodictableII();
								       ob5.viewType(s5);
	                                                               System.out.print("\t PRESS ENTER TO CONTINUE...");
	                                                               br.readLine();
								       break;
								case 6:
	                                                               System.out.print("\t ENTER ELEMENT NAME: ");
								       String s6=br.readLine();
								       periodictableII ob6=new periodictableII();                 
	                                                               ob6.viewPosition(s6);
	                                                               System.out.print("\t PRESS ENTER TO CONTINUE...");
	                                                               br.readLine();
								       break;
								case 7:
	                                                                System.out.print("\t\t GOING BACK.");
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                        System.out.print(".");
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                        System.out.print(".");
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                        System.out.print(".");
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                        System.out.print(".");
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                        System.out.print(".");
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                        System.out.print(".");
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	                                                                for(as=0;as<20000000;as++);
	System.out.print(".");
	                                                                break;
								default:
	                                                                System.out.println("\t\tINVALID ENTRY...........");
	                                                                System.out.println("\t\tPRESS ENTER TO TRY AGAIN.....");
	                                                                br.readLine();
								        break;
							}
	                                        }while(op1!=7);
						break;
	                                case 2:
	                                       System.out.print("\t\tENTER SYMBOL: ");
					       String s7=br.readLine();
					       periodictableII ob7=new periodictableII();
	                                       ob7.viewElement(s7);
	                                       System.out.print("\t\tPRESS ENTER TO CONTINUE...");
	                                       br.readLine();
					       break;
	                                case 3:
	                                       System.out.print("\t\tENTER PERIOD: ");
					       int s8=Integer.parseInt(br.readLine());
					       periodictableII ob8=new periodictableII();
	                                       ob8.viewPeriod(s8);
	                                       System.out.print("\t\tPRESS ENTER TO CONTINUE...");
	                                       br.readLine();
					       break;
	                                case 4:
	                                       System.out.print("\t\tENTER GROUP [FORMAT=VII-A]: ");
					       String s9=br.readLine();
					       periodictableII ob9=new periodictableII();
					       ob9.viewGroup(s9);
	                                       System.out.print("\t\tPRESS ENTER TO CONTINUE...");
	                                       br.readLine();
					       break;
	                                case 5:
	                                        System.out.println("PLEASE WAIT WHILE THE MODERN PERIODIC TABLE IS BEING DEVELOPED.......");
	                                        for(as=0;as<20000000;as++);for(as=0;as<20000000;as++);
	                                        for(as=0;as<20000000;as++);for(as=0;as<20000000;as++);
	                                        for(as=0;as<20000000;as++);for(as=0;as<20000000;as++);
	                                        for(as=0;as<20000000;as++);for(as=0;as<20000000;as++);
	                                        for(as=0;as<20000000;as++);for(as=0;as<20000000;as++);
	                                        for(as=0;as<20000000;as++);for(as=0;as<20000000;as++);
	                                        System.out.print("\nTHE PERIODIC TABLE IS READY.\nPRESS ENTER TO VIEW THE MODERN PERIODIC TABLE.");
	                                        br.readLine();
	                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	                                        System.out.println("\t 1A 2A 3B 4B 5B 6B 7B    8      1B  2B  3A  4A  5A  6A  7A  0   ");
	                                        System.out.println("\tÚÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÄÂÄÄÄÂÄÄÄÂÄÄÄÂÄÄÄÂÄÄÄÂÄÄÄÂÄÄÄÂÄÄÄ¿");
	                                        System.out.println("\t³H ³  ³  ³  ³  ³  ³  ³  ³  ³   ³   ³   ³   ³   ³   ³   ³   ³He ³");
	                                        System.out.println("\tÃÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄ´");
	                                        System.out.println("\t³Li³Be³  ³  ³  ³  ³  ³  ³  ³   ³   ³   ³B  ³C  ³N  ³O  ³F  ³Ne ³");
	                                        System.out.println("\tÃÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄ´");
	                                        System.out.println("\t³Na³Mg³  ³  ³  ³  ³  ³  ³  ³   ³   ³   ³Al ³Si ³P  ³S  ³Cl ³Ar ³");
	                                        System.out.println("\tÃÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄ´");
	                                        System.out.println("\t³K ³Ca³Sc³Ti³V ³Cr³Mn³Fe³Co³Ni ³Cu ³Zn ³Ga ³Ge ³As ³Se ³Br ³Kr ³");
	                                        System.out.println("\tÃÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄ´");
	                                        System.out.println("\t³Rb³Sr³Y ³Zr³Nb³Mo³Te³Ru³Rh³Pd ³Ag ³Cd ³In ³Sn ³Sb ³Te ³I  ³Xe ³");
	                                        System.out.println("\tÃÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄ´");
	                                        System.out.println("\t³Cs³Ba³La³Hf³Ta³W ³Re³Os³Ir³Pt ³Au ³Hg ³Ti ³Pb ³Bi ³Po ³At ³Rn ³");
	                                        System.out.println("\tÃÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄÅÄÄÄ´");
	                                        System.out.println("\t³Fr³Ra³Ac³Rf³Db³Sg³Bh³Hs³Mt³Uun³Uuu³Uub³Uut³Uuq³Uup³Uuh³Uus³Uuo³");
	                                        System.out.println("\tÀÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÄÁÄÄÄÁÄÄÄÁÄÄÄÁÄÄÄÁÄÄÄÁÄÄÄÁÄÄÄÁÄÄÄÙ");
	                                        System.out.println();
	                                        System.out.println();
	                                        System.out.println("\t\tÚÄÄÄÄÄÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄÂÄÄ¿");
	                                        System.out.println("\t\t³Lanth: ³Ce³Pr³Nd³Pm³Sm³Eu³Gd³Tb³Dy³Ho³Er³Tm³Yb³Lu³");
	                                        System.out.println("\t\tÃÄÄÄÄÄÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄÅÄÄ´");
	                                        System.out.println("\t\t³Actin: ³Th³Pa³U ³Np³Pu³Am³Cm³Bk³Cs³Es³Fm³Md³No³Lr³");
	                                        System.out.println("\t\tÀÄÄÄÄÄÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÁÄÄÙ");
	                                        System.out.print("PRESS ENTER TO CONTINUE");
	                                        br.readLine();
	                                        break;
	                                case 6:
	                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	                                        System.out.println("ÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜÜ");
	                                        System.out.println("Û                                                                            Û");
	                                        System.out.println("Û                    THE MODERN PERIODIC TABLE                               Û");
	                                        System.out.println("Û                   ÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄ                              Û");
	                                        System.out.println("Û                                                                            Û");
	                                        System.out.println("Û                 CREATED BY:-                                               Û");
	                                        System.out.println("Û                                ADARSH PADHI                                Û");
	                                        System.out.println("Û                                 CSE-B                                      Û");
	                                        System.out.println("Û                             A member of CODEX                              Û");
	                                        System.out.println("Û                                                                            Û");
	                                        System.out.println("Û                                                                            Û");
	                                        System.out.println("ßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßß");
	                                        System.out.print("\tPRESS ENTER TO EXIT:");
	                                        br.readLine();
	                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	                                        break;
	                                default:
	                                        System.out.println("\t\t INVALID ENTRY..........");
	                                        System.out.println("\t\t PRESS ENTER TO TRY AGAIN........");
	                                        br.readLine();
	                        }
	                }while(option!=6);
	        }
	}



