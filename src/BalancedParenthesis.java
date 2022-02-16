import java.util.Stack;

public class BalancedParenthesis {
    public boolean checkPar(char[] arr){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='{'||arr[i]=='['||arr[i]=='(')
                st.push(arr[i]);
            else{
                if(st.empty())
                    return false;
                else{
                    char temp1 = arr[i];
                    char temp = st.pop();
                    if(temp=='{' && temp1!='}'||temp=='[' && temp1!=']'||temp=='(' && temp1!=')')
                        return false;
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String str = "([{])";
    BalancedParenthesis obj = new BalancedParenthesis();
        System.out.println(obj.checkPar(str.toCharArray()));
    }
}
