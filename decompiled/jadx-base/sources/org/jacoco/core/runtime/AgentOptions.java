package org.jacoco.core.runtime;

/* JADX INFO: loaded from: classes6.dex */
public final class AgentOptions {
    public static final java.lang.String DEFAULT_DESTFILE = "jacoco.exec";
    public static final int DEFAULT_PORT = 6300;
    public static final java.lang.String SESSIONID = "sessionid";
    private final java.util.Map<java.lang.String, java.lang.String> options;
    private static final java.util.regex.Pattern OPTION_SPLIT = java.util.regex.Pattern.compile(",(?=[a-zA-Z0-9_\\-]+=)");
    public static final java.lang.String DEFAULT_ADDRESS = null;
    public static final java.lang.String DESTFILE = "destfile";
    public static final java.lang.String APPEND = "append";
    public static final java.lang.String INCLUDES = "includes";
    public static final java.lang.String EXCLUDES = "excludes";
    public static final java.lang.String EXCLCLASSLOADER = "exclclassloader";
    public static final java.lang.String INCLBOOTSTRAPCLASSES = "inclbootstrapclasses";
    public static final java.lang.String INCLNOLOCATIONCLASSES = "inclnolocationclasses";
    public static final java.lang.String DUMPONEXIT = "dumponexit";
    public static final java.lang.String OUTPUT = "output";
    public static final java.lang.String ADDRESS = "address";
    public static final java.lang.String PORT = "port";
    public static final java.lang.String CLASSDUMPDIR = "classdumpdir";
    public static final java.lang.String JMX = "jmx";
    private static final java.util.Collection<java.lang.String> VALID_OPTIONS = java.util.Arrays.asList(DESTFILE, APPEND, INCLUDES, EXCLUDES, EXCLCLASSLOADER, INCLBOOTSTRAPCLASSES, INCLNOLOCATIONCLASSES, "sessionid", DUMPONEXIT, OUTPUT, ADDRESS, PORT, CLASSDUMPDIR, JMX);

    public enum OutputMode {
        file,
        tcpserver,
        tcpclient,
        none
    }

    public AgentOptions() {
        this.options = new java.util.HashMap();
    }

    public AgentOptions(java.lang.String str) {
        this();
        if (str == null || str.length() <= 0) {
            return;
        }
        for (java.lang.String str2 : OPTION_SPLIT.split(str)) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf == -1) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid agent option syntax \"%s\".", str));
            }
            java.lang.String strSubstring = str2.substring(0, iIndexOf);
            if (!VALID_OPTIONS.contains(strSubstring)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Unknown agent option \"%s\".", strSubstring));
            }
            setOption(strSubstring, str2.substring(iIndexOf + 1));
        }
        validateAll();
    }

    public AgentOptions(java.util.Properties properties) {
        this();
        for (java.lang.String str : VALID_OPTIONS) {
            java.lang.String property = properties.getProperty(str);
            if (property != null) {
                setOption(str, property);
            }
        }
    }

    private void validateAll() {
        validatePort(getPort());
        getOutput();
    }

    private void validatePort(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("port must be positive");
        }
    }

    public java.lang.String getDestfile() {
        return getOption(DESTFILE, DEFAULT_DESTFILE);
    }

    public void setDestfile(java.lang.String str) {
        setOption(DESTFILE, str);
    }

    public boolean getAppend() {
        return getOption(APPEND, true);
    }

    public void setAppend(boolean z) {
        setOption(APPEND, z);
    }

    public java.lang.String getIncludes() {
        return getOption(INCLUDES, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
    }

    public void setIncludes(java.lang.String str) {
        setOption(INCLUDES, str);
    }

    public java.lang.String getExcludes() {
        return getOption(EXCLUDES, "");
    }

    public void setExcludes(java.lang.String str) {
        setOption(EXCLUDES, str);
    }

    public java.lang.String getExclClassloader() {
        return getOption(EXCLCLASSLOADER, "sun.reflect.DelegatingClassLoader");
    }

    public void setExclClassloader(java.lang.String str) {
        setOption(EXCLCLASSLOADER, str);
    }

    public boolean getInclBootstrapClasses() {
        return getOption(INCLBOOTSTRAPCLASSES, false);
    }

    public void setInclBootstrapClasses(boolean z) {
        setOption(INCLBOOTSTRAPCLASSES, z);
    }

    public boolean getInclNoLocationClasses() {
        return getOption(INCLNOLOCATIONCLASSES, false);
    }

    public void setInclNoLocationClasses(boolean z) {
        setOption(INCLNOLOCATIONCLASSES, z);
    }

    public java.lang.String getSessionId() {
        return getOption("sessionid", (java.lang.String) null);
    }

    public void setSessionId(java.lang.String str) {
        setOption("sessionid", str);
    }

    public boolean getDumpOnExit() {
        return getOption(DUMPONEXIT, true);
    }

    public void setDumpOnExit(boolean z) {
        setOption(DUMPONEXIT, z);
    }

    public int getPort() {
        return getOption(PORT, DEFAULT_PORT);
    }

    public void setPort(int i) {
        validatePort(i);
        setOption(PORT, i);
    }

    public java.lang.String getAddress() {
        return getOption(ADDRESS, DEFAULT_ADDRESS);
    }

    public void setAddress(java.lang.String str) {
        setOption(ADDRESS, str);
    }

    public org.jacoco.core.runtime.AgentOptions.OutputMode getOutput() {
        java.lang.String str = this.options.get(OUTPUT);
        return str == null ? org.jacoco.core.runtime.AgentOptions.OutputMode.file : org.jacoco.core.runtime.AgentOptions.OutputMode.valueOf(str);
    }

    public void setOutput(java.lang.String str) {
        setOutput(org.jacoco.core.runtime.AgentOptions.OutputMode.valueOf(str));
    }

    public void setOutput(org.jacoco.core.runtime.AgentOptions.OutputMode outputMode) {
        setOption(OUTPUT, outputMode.name());
    }

    public java.lang.String getClassDumpDir() {
        return getOption(CLASSDUMPDIR, (java.lang.String) null);
    }

    public void setClassDumpDir(java.lang.String str) {
        setOption(CLASSDUMPDIR, str);
    }

    public boolean getJmx() {
        return getOption(JMX, false);
    }

    public void setJmx(boolean z) {
        setOption(JMX, z);
    }

    private void setOption(java.lang.String str, int i) {
        setOption(str, java.lang.Integer.toString(i));
    }

    private void setOption(java.lang.String str, boolean z) {
        setOption(str, java.lang.Boolean.toString(z));
    }

    private void setOption(java.lang.String str, java.lang.String str2) {
        this.options.put(str, str2);
    }

    private java.lang.String getOption(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = this.options.get(str);
        return str3 == null ? str2 : str3;
    }

    private boolean getOption(java.lang.String str, boolean z) {
        java.lang.String str2 = this.options.get(str);
        return str2 == null ? z : java.lang.Boolean.parseBoolean(str2);
    }

    private int getOption(java.lang.String str, int i) {
        java.lang.String str2 = this.options.get(str);
        return str2 == null ? i : java.lang.Integer.parseInt(str2);
    }

    public java.lang.String getVMArgument(java.io.File file) {
        return java.lang.String.format("-javaagent:%s=%s", file, this);
    }

    public java.lang.String getQuotedVMArgument(java.io.File file) {
        return org.jacoco.core.runtime.CommandLineSupport.quote(getVMArgument(file));
    }

    public java.lang.String prependVMArguments(java.lang.String str, java.io.File file) {
        java.util.List<java.lang.String> listSplit = org.jacoco.core.runtime.CommandLineSupport.split(str);
        java.lang.String str2 = java.lang.String.format("-javaagent:%s", file);
        java.util.Iterator<java.lang.String> it = listSplit.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith(str2)) {
                it.remove();
            }
        }
        listSplit.add(0, getVMArgument(file));
        return org.jacoco.core.runtime.CommandLineSupport.quote(listSplit);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : VALID_OPTIONS) {
            java.lang.String str2 = this.options.get(str);
            if (str2 != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str).append('=').append(str2);
            }
        }
        return sb.toString();
    }
}
