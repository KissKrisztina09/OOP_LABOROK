package labor10_4;

public interface IExpression {
    public static double evaluate( String postfixExpression) throws ExpressionException{
        Stack stack = new Stack(10);
        String[] elements = postfixExpression.split("");
        for(String e:elements){
            if(isOperator(e)){
                int num1;
                int num2;
                try{
                    num1 = (int)stack.top();
                    stack.pop();
                    num2 = (int)stack.top();
                    stack.pop();
                    if(e.equals("/")){
                        stack.push((double)num2/num1);
                        continue;
                    }
                    if(e.equals("*")){
                        stack.push(num2*num1);
                        continue;
                    }
                    if(e.equals("+")){
                        stack.push(num2+num1);
                        continue;
                    }
                    if(e.equals("-")){
                        stack.push(num2-num1);
                        continue;
                    }
                }catch (StackException stackException){
                    throw new ExpressionException("Wrong expression");
                }
            }
            else{
                try{
                    stack.push(Double.parseDouble(e));
                }catch (StackException stackException){
                    throw new ExpressionException("Stack size is not proper!");
                }catch (NumberFormatException e1){
                    throw new ExpressionException("Wrong operand!")
                }
            }
            try{
                return stack.top();
            }catch (StackException stackException){
                throw new ExpressionException("Wrong expression!");
            }
        }
    }
    static boolean isOperator(String op){

    }
}
