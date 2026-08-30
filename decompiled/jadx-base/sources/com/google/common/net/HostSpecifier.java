package com.google.common.net;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class HostSpecifier {
    private final java.lang.String canonicalForm;

    private HostSpecifier(java.lang.String canonicalForm) {
        this.canonicalForm = canonicalForm;
    }

    public static com.google.common.net.HostSpecifier fromValid(java.lang.String specifier) {
        java.net.InetAddress inetAddressForString;
        com.google.common.net.HostAndPort hostAndPortFromString = com.google.common.net.HostAndPort.fromString(specifier);
        com.google.common.base.Preconditions.checkArgument(!hostAndPortFromString.hasPort());
        java.lang.String host = hostAndPortFromString.getHost();
        try {
            inetAddressForString = com.google.common.net.InetAddresses.forString(host);
        } catch (java.lang.IllegalArgumentException unused) {
            inetAddressForString = null;
        }
        if (inetAddressForString != null) {
            return new com.google.common.net.HostSpecifier(com.google.common.net.InetAddresses.toUriString(inetAddressForString));
        }
        com.google.common.net.InternetDomainName internetDomainNameFrom = com.google.common.net.InternetDomainName.from(host);
        if (internetDomainNameFrom.hasPublicSuffix()) {
            return new com.google.common.net.HostSpecifier(internetDomainNameFrom.toString());
        }
        throw new java.lang.IllegalArgumentException("Domain name does not have a recognized public suffix: " + host);
    }

    public static com.google.common.net.HostSpecifier from(java.lang.String specifier) throws java.text.ParseException {
        try {
            return fromValid(specifier);
        } catch (java.lang.IllegalArgumentException e) {
            java.text.ParseException parseException = new java.text.ParseException("Invalid host specifier: " + specifier, 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static boolean isValid(java.lang.String specifier) {
        try {
            fromValid(specifier);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof com.google.common.net.HostSpecifier) {
            return this.canonicalForm.equals(((com.google.common.net.HostSpecifier) other).canonicalForm);
        }
        return false;
    }

    public int hashCode() {
        return this.canonicalForm.hashCode();
    }

    public java.lang.String toString() {
        return this.canonicalForm;
    }
}
