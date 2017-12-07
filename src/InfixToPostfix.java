public class InfixToPostfix extends LStack {
 
    public InfixToPostfix()
    {
        //super(x);
    }
 
    public String InToPost(String infixString1) {
        String infixString   = infixString1.replaceAll("\\s","");
        String postfixString = "";
 
 
        for (int index = 0; index < infixString.length(); ++index) {
            char chValue = infixString.charAt(index);
            
            if (chValue == '(') {
            
            	this.push('(');

            } else if (chValue == ')') {
                
            	char chrGetData = ' ';
            	
                while ( true )
                {
                	
                	Node temp = this.peek();
                    
                    if (!(chrGetData == '(') && !(this.isEmpty()))
                    {
                    	Character oper = (Character) temp.getData();	
                    	chrGetData = oper.charValue();
                    	postfixString += chrGetData;
                    	this.pop();
                    }
                    else
                    { 
                    	break; 
                    }
                    
                }
                this.pop();

            } else if (chValue == '+' || chValue == '-') {
                //Stack is empty
                if (this.isEmpty()) {
                    this.push(chValue);
                    //current Stack is not empty
                } else {
                    Node temp3 = this.peek();
                    Character oper = (Character) temp3.getData();
                    while (!(this.isEmpty() || oper.equals(new Character('(')) || oper.equals(new Character(')')))) {
                        this.pop();
                        postfixString += oper.charValue();
                    }
                    this.push(chValue);
                }
            } else if (chValue == '*' || chValue == '/') {
                if (this.isEmpty()) {
                    this.push(chValue);
                } else {
                    Node temp4 = this.peek();
                    Character oper = (Character) temp4.getData();
                    while (!oper.equals(new Character('+')) && !oper.equals(new Character('-')) && !this.isEmpty()) {
                        this.pop();
                        postfixString += oper.charValue();
                    }
                    this.push(chValue);
                }
            } else {
                postfixString += chValue;
            }
        }
        while (!this.isEmpty()) {
            Node temp5 = this.peek();
            Character oper = (Character) temp5.getData();
            if (!oper.equals(new Character('('))) {
                this.pop();
                postfixString += oper.charValue();
            }
        }
        return postfixString;
    }
/*
    public static void main(String[] args) {
        Infix2Postfix mystack = new Infix2Postfix(10);
        System.out.println("Type in an expression like (1+2)*(3+4)/(12-5)\n "
                + "with no monadic operators like in-5 or +5 followed by key");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("The Expression you have typed in infix form :\n"+str);
        System.out.println("The Equivalent Postfix Expression is :\n"+mystack.InToPost(str));
    }
    */
}
 
