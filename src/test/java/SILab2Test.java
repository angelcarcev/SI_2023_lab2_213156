import jdk.jfr.Percentage;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private List<String> createList(String... elems) {

        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everybranch(){
        List<User> users = new ArrayList<>();

        //test1
        String u1="angel.carchev";
        String p1 = null;
        String e1 = "angel.carchev@gmail.com";
        User user1 = new User(u1, null, e1);
        users.add(user1);
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, ()-> SILab2.function(user1, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test2
        String u2=null;
        String p2 = "1234";
        String e2 = "angel.carcev@gmail.com";
        User user2 = new User(u2, p2, e2);
        users.add(user2);
        assertEquals(false, SILab2.function(user2,users));

        //test3
        String u3="Marko";
        String p3 = "kdvsuh jdchksjbhkj";
        String e3 = "Markgmailcom";
        User user3 = new User(u3, p3, e3);
        users.add(user3);
        assertEquals(false, SILab2.function(user3,users));

        //test4
        String u4="Eva";
        String p4 = "eva#1 238";
        String e4 = "eva#1 238";
        User user4 = new User(u4, p4, e4);
        assertEquals(false, SILab2.function(user4,users));

        //test5
        String u5="Jovan";
        String p5 = "java 123vlo";
        String e5 = "msdf@gmail.com";
        User user5 = new User(u5, p5, e5);
        assertEquals(false, SILab2.function(user5,users));
    }
    @Test
    void multiplecondition(){
        List<User> users=new ArrayList<>();

        //test1
        User u1=null;
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u1,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test2
        String username2="Marko";
        String password2 = null;
        String email2 = "MarkO@gmailcomuser1";
        User u2 = new User(username2, password2, email2);
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u2,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test3
        String username3="Eva";
        String password3 = "eva#1238";
        String email3 = null;
        User u3 = new User(username3, password3, email3);
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u3,users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test4
        String username4="Jovan";
        String password4 = "java 123vlo";
        String email4= "msdf@gmail.com";
        User u4 = new User(username4, password4, email4);
        assertFalse(SILab2.function(u4,users));
    }

}
