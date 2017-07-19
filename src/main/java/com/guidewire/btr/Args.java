package com.guidewire.btr;

import com.beust.jcommander.Parameter;
import java.util.List;

public class Args {
  @Parameter(names = "-help", help = true)
  private boolean help;

  @Parameter(names = "-rootGitDir", description = "project root directory which containg .git folder", required = true)
  private String rootGitDir;

  @Parameter(names = "-jacocoXmlReportPath", description = "JacocoXmlReport file's relative path to $rootGitDir", required = true)
  private String jacocoXmlReportPath = "build/reports/jacoco/test/jacocoTestReport.xml";

  @Parameter(names = "-jacocoHtmlReportDir", description = "JacocoHtmlReportDirectory's relative path to $rootGitDir", required = true)
  private String jacocoHtmlReportDir = "build/reports/jacoco/test/html";

  @Parameter(names = "-srcDirs", description = "all source directories relative to $rootGitDir (ex: --srcDirs src/main/java --srcDirs src/main/groovy --srcDirs gsrc)", required = true)
  private List<String> srcDirs;

  @Parameter(names = "-startCommit", description = "starting GIT commit (ex: b81b264098b)", required = true)
  private String startCommit;

  @Parameter(names = "-endCommit", description = "ending GIT commit. If not set, it will be the HEAD commit of the current branch.")
  private String endCommit;

  @Parameter(names = "-smtpHost", description = "smtp host for email send", required = true)
  private String smtpHost;

  @Parameter(names = "-senderEmail", description = "email address to be used as the sender of notification emails", required = true)
  private String senderEmail;

  public boolean isHelp() {
    return help;
  }

  public String getRootGitDir() {
    return rootGitDir;
  }

  public String getJacocoXmlReportPath() {
    return jacocoXmlReportPath;
  }

  public String getJacocoHtmlReportDir() {
    return jacocoHtmlReportDir;
  }

  public List<String> getSrcDirs() {
    return srcDirs;
  }

  public String getStartCommit() {
    return startCommit;
  }

  public String getEndCommit() {
    return endCommit;
  }

  public String getSmtpHost() {
    return smtpHost;
  }

  public String getSenderEmail() {
    return senderEmail;
  }
}