package midTerm;

public class MessageBuilder {

    private String message;
    private int numWords;
    //private static String[] text = "to be or not to be".split(" ");
    private static String[] text =  "as soon as possible".split(" ");
    private static int index = 0;

    public String toString(){
        return ":"+message +":"+ numWords;
    }
    public static String getNextWord(String next)
    {
        for(int i = index; i < text.length; i++){
            if( next.equals(text[i]) && i < text.length -1  ){
                index = i + 1;
                return text[i + 1];
            }
        }
        return null;

    }

    public MessageBuilder(String m){
        String next = m;

        numWords = 1;
        message = next;
        next = getNextWord(next);

        while( next != null){
            message += " "+ next;
            numWords++;
            next =  getNextWord(next);
        }

    }

    public String getAbbreviation1(){
        int startIndex = 0;
        String result = new String();
        for(int i = 0 ; i < numWords; i++){
            result += this.message.substring(startIndex , startIndex + 1);
            startIndex = this.message.indexOf(" ", startIndex  ) + 1 ;
        }

        return result;
    }

    public String getAbbreviation2(){
        String temp = this.message;
        String result = new String();
        int index = -1;
        while(temp.length() > 0){
            result += temp.substring(0,1);
            index = temp.indexOf(" ");
            if(index >= 0){
                temp = temp.substring(index +1);
            }else{
                break;
            }
        }

        return result;
    }

    public String getAbbreviation3(){
        String[] word = this.message.split(" ");
        String result = new String();
        for(String w: word){
            result += w.substring(0,1);
        }
        return result;
    }

    public String getAbbreviation4(){
        String result = new String();
        result += this.message.substring(0,1);
        for(int i = 0 ; i < message.length(); i++){
            if( message.charAt(i) == ' '){
                result += message.substring(i +1, i+2);
            }
        }
        return result;
    }

    public static void main(String[] args){
        //MessageBuilder mb = new MessageBuilder("to");
        MessageBuilder mb = new MessageBuilder("as");
        System.out.println(mb);

        System.out.println(mb.getAbbreviation1());
        System.out.println(mb.getAbbreviation2());
        System.out.println(mb.getAbbreviation3());
        System.out.println(mb.getAbbreviation4());



    }



}
