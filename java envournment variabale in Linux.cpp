

To Set JAVA_HOME / PATH for a single user, Login to your account and open .bash_profile file

$ vi ~/.bash_profile

Set JAVA_HOME as follows using syntax export JAVA_HOME=<path-to-java>. If your path is set to /usr/java/jdk1.5.0_07/bin/java, set it as follows:

export JAVA_HOME=/usr/java/jdk1.5.0_07/bin/java

Set PATH as follows:

export PATH=$PATH:/usr/java/jdk1.5.0_07/bin

Feel free to replace /usr/java/jdk1.5.0_07 as per your setup. Save and close the file. Just logout and login back to see new changes. Alternatively, type the following command to activate the new path settings immediately:

$ source ~/.bash_profile

OR

$ . ~/.bash_profile

Verify new settings:

$ echo $JAVA_HOME
$ echo $PATH

Tip: Use the following command to find out exact path to which java executable under UNIX / Linux:

$ which java

Please note that the file ~/.bashrc is similar, with the exception that ~/.bash_profile runs only for Bash login shells and .bashrc runs for every new Bash shell.

To Set JAVA_HOME / PATH for all user, You need to setup global config in /etc/profile OR /etc/bash.bashrc file for all users:

# vi /etc/profile

Next setup PATH / JAVA_PATH variables as follows:

export PATH=$PATH:/usr/java/jdk1.5.0_07/bin
export PATH=$PATH:/usr/java/jdk1.5.0_07/bin

Save and close the file. Once again you need to type the following command to activate the path settings immediately:

# source /etc/profile

OR

# . /etc/profile


