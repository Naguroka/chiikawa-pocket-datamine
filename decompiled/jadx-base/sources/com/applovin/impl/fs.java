package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f803a;
    private java.util.Stack b;
    private java.lang.StringBuilder c;
    private long d;
    private com.applovin.impl.fs.b e;

    fs(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            this.f803a = jVar.I();
            return;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    class a implements org.xml.sax.ContentHandler {
        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            java.lang.String strTrim = new java.lang.String(java.util.Arrays.copyOfRange(cArr, i, i2)).trim();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strTrim)) {
                com.applovin.impl.fs.this.c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(java.lang.String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(java.lang.String str, java.lang.String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(org.xml.sax.Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(java.lang.String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(java.lang.String str, java.lang.String str2) {
        }

        a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.n unused = com.applovin.impl.fs.this.f803a;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.fs.this.f803a.a("XmlParser", "Begin parsing...");
            }
            com.applovin.impl.fs.this.d = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis()) - com.applovin.impl.fs.this.d;
            com.applovin.impl.sdk.n unused = com.applovin.impl.fs.this.f803a;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.fs.this.f803a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
            try {
                com.applovin.impl.fs.b bVar = !com.applovin.impl.fs.this.b.isEmpty() ? (com.applovin.impl.fs.b) com.applovin.impl.fs.this.b.peek() : null;
                com.applovin.impl.fs.b bVar2 = new com.applovin.impl.fs.b(str2, com.applovin.impl.fs.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                com.applovin.impl.fs.this.b.push(bVar2);
            } catch (java.lang.Exception e) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.fs.this.f803a;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.fs.this.f803a.a("XmlParser", "Unable to process element <" + str2 + ">", e);
                }
                throw new org.xml.sax.SAXException("Failed to start element", e);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            com.applovin.impl.fs fsVar = com.applovin.impl.fs.this;
            fsVar.e = (com.applovin.impl.fs.b) fsVar.b.pop();
            com.applovin.impl.fs.this.e.d(com.applovin.impl.fs.this.c.toString().trim());
            com.applovin.impl.fs.this.c.setLength(0);
        }
    }

    private static class b extends com.applovin.impl.es {
        b(java.lang.String str, java.util.Map map, com.applovin.impl.es esVar) {
            super(str, map, esVar);
        }

        void d(java.lang.String str) {
            this.d = str;
        }

        void a(com.applovin.impl.es esVar) {
            if (esVar != null) {
                this.e.add(esVar);
                return;
            }
            throw new java.lang.IllegalArgumentException("None specified.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map a(org.xml.sax.Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            java.util.HashMap map = new java.util.HashMap(length);
            for (int i = 0; i < length; i++) {
                map.put(attributes.getQName(i), attributes.getValue(i));
            }
            return map;
        }
        return java.util.Collections.emptyMap();
    }

    public com.applovin.impl.es a(java.lang.String str) throws org.xml.sax.SAXException {
        if (str != null) {
            this.c = new java.lang.StringBuilder();
            this.b = new java.util.Stack();
            this.e = null;
            android.util.Xml.parse(str, new com.applovin.impl.fs.a());
            com.applovin.impl.fs.b bVar = this.e;
            if (bVar != null) {
                return bVar;
            }
            throw new org.xml.sax.SAXException("Unable to parse XML into node");
        }
        throw new java.lang.IllegalArgumentException("Unable to parse. No XML specified.");
    }

    public static com.applovin.impl.es a(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        return new com.applovin.impl.fs(jVar).a(str);
    }
}
