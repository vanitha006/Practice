import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class VelocityDemo {
    public static void main(String args[]) throws Exception{
        VelocityEngine ve=new VelocityEngine();
        ve.init();
        Template t=ve.getTemplate("/src/main/java/helloworld.vm");
        VelocityContext context=new VelocityContext();
        context.put("name","world");
        StringWriter writer=new StringWriter();
        t.merge(context,writer);
        System.out.println(writer.toString());
    }
}
