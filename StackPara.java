
import java.util.Stack;

class StackPara {

    public static void main(String[] args) {

        String str1 = "[]";
        String str2 = "[{{}}]";
        String str3 = "{([()]})}";
        String str4 = "{[]}}";

        //  [   ]   -> valid 
        //  [   {   {   }   }   ]    -> valid 
        //  {   (       }   )   } -> inValid 
        //      }  --> invalid   
        //  [   ]       {       }       {   [   ]   }   
        //  {   [   ]   }   }     
        //                  X
        // System.out.println(str2);
        // for(int i=0;i<str2.length();i++){
        //     System.out.println(str2.charAt(i));//str2[i]
        // }
        Stack<Character> stack = new Stack<>();

        for (char x : str4.toCharArray()) {
            // System.out.println(x);

            if (x == '[' || x == '{' || x == '(') {
                stack.push(x);
            } else {

                
                //x = ] 
                //y = [
                if (stack.isEmpty()) {
                    System.out.println("Invalid Expression !!");
                    return;
                }
                char y = stack.pop();
                if ((x == ']' && y == '[') || (x == '}' && y == '{') || (x == ')' && y == '(')) {
                    continue;
                } else {
                    System.out.println("Invalid Expression");
                    return;
                }
            }
        }

        System.out.println("Valid Expression");

       

    }
}
