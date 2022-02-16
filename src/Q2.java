
class inputLengthException extends Throwable{
    public inputLengthException(String message){
        super(message);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Q<String> q = new Q<>();
            try {
                if(args.length>3)
                throw new inputLengthException("Can't enter more than 3 inputs");
            } catch (inputLengthException e) {
                e.getMessage();
                return;
            }
        for(var str : args){
            int sum=0;
            for(int i=0;i<str.length();i++){
                for(int j=i;j<str.length();j++)
                    sum+=Character.getNumericValue(str.charAt(j));
            }
            String ans = String.valueOf(sum);
            q.enqueue(ans);
        }
        while (!q.isEmpty()){
            q.dequeue();
        }
    }
}
