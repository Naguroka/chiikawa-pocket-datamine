package com.google.firebase.encoders.proto;

/* JADX INFO: loaded from: classes5.dex */
public final class AtProtobuf {
    private com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT;
    private int tag;

    public com.google.firebase.encoders.proto.AtProtobuf tag(int i) {
        this.tag = i;
        return this;
    }

    public com.google.firebase.encoders.proto.AtProtobuf intEncoding(com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding) {
        this.intEncoding = intEncoding;
        return this;
    }

    public static com.google.firebase.encoders.proto.AtProtobuf builder() {
        return new com.google.firebase.encoders.proto.AtProtobuf();
    }

    public com.google.firebase.encoders.proto.Protobuf build() {
        return new com.google.firebase.encoders.proto.AtProtobuf.ProtobufImpl(this.tag, this.intEncoding);
    }

    private static final class ProtobufImpl implements com.google.firebase.encoders.proto.Protobuf {
        private final com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding;
        private final int tag;

        ProtobufImpl(int i, com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding) {
            this.tag = i;
            this.intEncoding = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public java.lang.Class<? extends java.lang.annotation.Annotation> annotationType() {
            return com.google.firebase.encoders.proto.Protobuf.class;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.tag;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding() {
            return this.intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.firebase.encoders.proto.Protobuf)) {
                return false;
            }
            com.google.firebase.encoders.proto.Protobuf protobuf = (com.google.firebase.encoders.proto.Protobuf) obj;
            return this.tag == protobuf.tag() && this.intEncoding.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.tag) + (this.intEncoding.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("@com.google.firebase.encoders.proto.Protobuf(tag=");
            sb.append(this.tag);
            sb.append("intEncoding=").append(this.intEncoding);
            sb.append(')');
            return sb.toString();
        }
    }
}
