package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ta extends com.applovin.impl.dk {
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.nio.charset.CharsetDecoder f1359a = com.applovin.exoplayer2.common.base.Charsets.UTF_8.newDecoder();
    private final java.nio.charset.CharsetDecoder b = com.applovin.exoplayer2.common.base.Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.impl.dk
    protected com.applovin.impl.af a(com.applovin.impl.df dfVar, java.nio.ByteBuffer byteBuffer) {
        java.lang.String strA = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        java.lang.String str = null;
        if (strA == null) {
            return new com.applovin.impl.af(new com.applovin.impl.va(bArr, null, null));
        }
        java.util.regex.Matcher matcher = c.matcher(strA);
        java.lang.String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(strGroup);
                lowerCase.hashCode();
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new com.applovin.impl.af(new com.applovin.impl.va(bArr, str, str2));
    }

    private java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        try {
            java.lang.String string = this.f1359a.decode(byteBuffer).toString();
            this.f1359a.reset();
            byteBuffer.rewind();
            return string;
        } catch (java.nio.charset.CharacterCodingException unused) {
            this.f1359a.reset();
            byteBuffer.rewind();
            try {
                return this.b.decode(byteBuffer).toString();
            } catch (java.nio.charset.CharacterCodingException unused2) {
                return null;
            } finally {
                this.b.reset();
                byteBuffer.rewind();
            }
        } catch (java.lang.Throwable th) {
            this.f1359a.reset();
            byteBuffer.rewind();
            throw th;
        }
    }
}
