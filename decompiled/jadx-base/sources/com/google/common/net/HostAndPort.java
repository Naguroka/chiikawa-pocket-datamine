package com.google.common.net;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class HostAndPort implements java.io.Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final java.lang.String host;
    private final int port;

    private static boolean isValidPort(int port) {
        return port >= 0 && port <= 65535;
    }

    private HostAndPort(java.lang.String host, int port, boolean hasBracketlessColons) {
        this.host = host;
        this.port = port;
        this.hasBracketlessColons = hasBracketlessColons;
    }

    public java.lang.String getHost() {
        return this.host;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int getPort() {
        com.google.common.base.Preconditions.checkState(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int defaultPort) {
        return hasPort() ? this.port : defaultPort;
    }

    public static com.google.common.net.HostAndPort fromParts(java.lang.String host, int port) {
        com.google.common.base.Preconditions.checkArgument(isValidPort(port), "Port out of range: %s", port);
        com.google.common.net.HostAndPort hostAndPortFromString = fromString(host);
        com.google.common.base.Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", host);
        return new com.google.common.net.HostAndPort(hostAndPortFromString.host, port, hostAndPortFromString.hasBracketlessColons);
    }

    public static com.google.common.net.HostAndPort fromHost(java.lang.String host) {
        com.google.common.net.HostAndPort hostAndPortFromString = fromString(host);
        com.google.common.base.Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", host);
        return hostAndPortFromString;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public static com.google.common.net.HostAndPort fromString(java.lang.String hostPortString) {
        java.lang.String str;
        boolean z;
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        com.google.common.base.Preconditions.checkNotNull(hostPortString);
        int i = -1;
        if (hostPortString.startsWith(com.ironsource.y8.i.d)) {
            java.lang.String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(hostPortString);
            strSubstring2 = hostAndPortFromBracketedHost[0];
            strSubstring = hostAndPortFromBracketedHost[1];
        } else {
            int iIndexOf = hostPortString.indexOf(58);
            if (iIndexOf >= 0) {
                int i2 = iIndexOf + 1;
                if (hostPortString.indexOf(58, i2) == -1) {
                    strSubstring2 = hostPortString.substring(0, iIndexOf);
                    strSubstring = hostPortString.substring(i2);
                }
                if (!com.google.common.base.Strings.isNullOrEmpty(strSubstring)) {
                    com.google.common.base.Preconditions.checkArgument(strSubstring.startsWith("+") && com.google.common.base.CharMatcher.ascii().matchesAllOf(strSubstring), "Unparseable port number: %s", hostPortString);
                    try {
                        i = java.lang.Integer.parseInt(strSubstring);
                        com.google.common.base.Preconditions.checkArgument(isValidPort(i), "Port number out of range: %s", hostPortString);
                    } catch (java.lang.NumberFormatException unused) {
                        throw new java.lang.IllegalArgumentException("Unparseable port number: " + hostPortString);
                    }
                }
                return new com.google.common.net.HostAndPort(str, i, z);
            }
            str = hostPortString;
            z = iIndexOf >= 0;
            strSubstring = null;
            if (!com.google.common.base.Strings.isNullOrEmpty(strSubstring)) {
                com.google.common.base.Preconditions.checkArgument(strSubstring.startsWith("+") && com.google.common.base.CharMatcher.ascii().matchesAllOf(strSubstring), "Unparseable port number: %s", hostPortString);
                i = java.lang.Integer.parseInt(strSubstring);
                com.google.common.base.Preconditions.checkArgument(isValidPort(i), "Port number out of range: %s", hostPortString);
            }
            return new com.google.common.net.HostAndPort(str, i, z);
        }
        str = strSubstring2;
        z = false;
        if (!com.google.common.base.Strings.isNullOrEmpty(strSubstring)) {
            com.google.common.base.Preconditions.checkArgument(strSubstring.startsWith("+") && com.google.common.base.CharMatcher.ascii().matchesAllOf(strSubstring), "Unparseable port number: %s", hostPortString);
            i = java.lang.Integer.parseInt(strSubstring);
            com.google.common.base.Preconditions.checkArgument(isValidPort(i), "Port number out of range: %s", hostPortString);
        }
        return new com.google.common.net.HostAndPort(str, i, z);
    }

    private static java.lang.String[] getHostAndPortFromBracketedHost(java.lang.String hostPortString) {
        com.google.common.base.Preconditions.checkArgument(hostPortString.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", hostPortString);
        int iIndexOf = hostPortString.indexOf(58);
        int iLastIndexOf = hostPortString.lastIndexOf(93);
        com.google.common.base.Preconditions.checkArgument(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", hostPortString);
        java.lang.String strSubstring = hostPortString.substring(1, iLastIndexOf);
        int i = iLastIndexOf + 1;
        if (i == hostPortString.length()) {
            return new java.lang.String[]{strSubstring, ""};
        }
        com.google.common.base.Preconditions.checkArgument(hostPortString.charAt(i) == ':', "Only a colon may follow a close bracket: %s", hostPortString);
        int i2 = iLastIndexOf + 2;
        for (int i3 = i2; i3 < hostPortString.length(); i3++) {
            com.google.common.base.Preconditions.checkArgument(java.lang.Character.isDigit(hostPortString.charAt(i3)), "Port must be numeric: %s", hostPortString);
        }
        return new java.lang.String[]{strSubstring, hostPortString.substring(i2)};
    }

    public com.google.common.net.HostAndPort withDefaultPort(int defaultPort) {
        com.google.common.base.Preconditions.checkArgument(isValidPort(defaultPort));
        return hasPort() ? this : new com.google.common.net.HostAndPort(this.host, defaultPort, this.hasBracketlessColons);
    }

    public com.google.common.net.HostAndPort requireBracketsForIPv6() {
        com.google.common.base.Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.common.net.HostAndPort)) {
            return false;
        }
        com.google.common.net.HostAndPort hostAndPort = (com.google.common.net.HostAndPort) other;
        return com.google.common.base.Objects.equal(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.host, java.lang.Integer.valueOf(this.port));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[').append(this.host).append(']');
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(':').append(this.port);
        }
        return sb.toString();
    }
}
