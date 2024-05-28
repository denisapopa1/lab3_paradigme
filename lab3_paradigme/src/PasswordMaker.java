
import java.util.Random;

    public class PasswordMaker {
        private static final int MagicNumber=10;
        private static final String MAGIC_STRING = generateRandomString(20);
        private static PasswordMaker instance;
        private static int getInstanceCount=0;
        private String name;

        private PasswordMaker(String name) {
            this.name = name;
        }


        /*public static synchronized PasswordMaker getInstance(String name){
            if(instance==null){
                instance=new PasswordMaker(name);
            }
            return instance;

        }*/

        static {
            instance=new PasswordMaker("DefaultName");
        }
        public static PasswordMaker getInstance(String name){
          getInstanceCount++;
          if(instance==null){
              instance=new PasswordMaker(name);
          }
            return instance;
        }
        public static int getGetInstanceCount(){
            return getInstanceCount;
        }
        private static String generateRandomString(int length){
            StringBuilder sb=new StringBuilder(length);
            Random random=new Random();
            for(int i=0;i<length;i++){
                char randomChar=(char)('a'+random.nextInt(26));
                sb.append(randomChar);
            }
            return sb.toString();
        }


    public String getPassword(){
        String randomString=generateRandomString(MagicNumber);
        String alphabet = getAlphabet();
        String nameLength=String.valueOf(name.length());
        Random random=new Random();
        int randomNumber=random.nextInt(51);
        String password=randomString+alphabet+nameLength+randomNumber;
        return password;
    }

    private String getAlphabet(){
        Random random= new Random();
        StringBuilder sb=new StringBuilder(10);
        for(int i=0;i<10;i++){
            char randomChar=MAGIC_STRING.charAt(random.nextInt(MAGIC_STRING.length()));
            sb.append(randomChar);
        }
        return sb.toString();
    }
    private static String generateMagicString(){
        StringBuilder sb=new StringBuilder(20);
        Random random=new Random();
        for(int i=0;i<20;i++){
            char randomChar=(char)('a'+random.nextInt(26));
            sb.append(randomChar);
        }
        return sb.toString();
    }


}



