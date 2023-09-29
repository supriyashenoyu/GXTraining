package AssgnPac;

public class RevArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Good Morning";
		  int n = str.length()-1;
	      String rev = "", t = "";

	        for(int i = 0; i <=n; i++){
	            t += str.charAt(i);
	            if((str.charAt(i) == ' ') || (i == n)){
	                for(int j = t.length()-1; j >= 0; j--){
	                    rev += t.charAt(j);
	                    if((j == 0) && (i != n))
	                        rev += " ";
	                }
	                t = "";
	            }
	        }
	        System.out.println(rev);
	
		}

	}


