package com.guidewire.btr;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sliu on 7/17/2017.
 */
public class MainProgram {



  public static void main(String[] args) {


//    String a, b = "hi";
//    System.out.println(a);
//    System.out.println(b);

    Args namedArgs = new Args();
    JCommander jCommander = new JCommander(namedArgs);
    jCommander.parse(args);

    if (namedArgs.isHelp()) {
      jCommander.usage();
      return;
    }

    System.out.println("-rootGitDir: " + namedArgs.getRootGitDir());
    System.out.println("-jacocoXmlReportPath: " + namedArgs.getJacocoXmlReportPath());
    System.out.println("-jacocoHtmlReportDir: " + namedArgs.getJacocoHtmlReportDir());
    System.out.println("-srcDirs: " + StringUtils.join(namedArgs.getSrcDirs(), ","));
    System.out.println("-startCommit: " + namedArgs.getStartCommit());
    System.out.println("-endCommit: " + namedArgs.getEndCommit());
    System.out.println("-smtpHost: " + namedArgs.getSmtpHost());
    System.out.println("-senderEmail: " + namedArgs.getSenderEmail());





    ImmutableMap<String, String> map = ImmutableMap.of("key1", "value1", "key2", "value2");

  }

//      MainProgram main = new MainProgram();
//      JCommander.newBuilder()
//              .addObject(main)
//              .build()
//              .parse(args);
//      main.run();
//    }
//
//    public void run() {
//      System.out.printf("%d %d", length, pattern);
//    }

}
