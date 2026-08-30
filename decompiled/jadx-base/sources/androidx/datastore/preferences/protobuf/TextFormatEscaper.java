package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class TextFormatEscaper {

    private interface ByteSequence {
        byte byteAt(int offset);

        int size();
    }

    private TextFormatEscaper() {
    }

    static java.lang.String escapeBytes(androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence input) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(input.size());
        for (int i = 0; i < input.size(); i++) {
            byte bByteAt = input.byteAt(i);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt >= 32 && bByteAt <= 126) {
                            sb.append((char) bByteAt);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static java.lang.String escapeBytes(final androidx.datastore.preferences.protobuf.ByteString input) {
        return escapeBytes(new androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.1
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return input.size();
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int offset) {
                return input.byteAt(offset);
            }
        });
    }

    static java.lang.String escapeBytes(final byte[] input) {
        return escapeBytes(new androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.2
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return input.length;
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int offset) {
                return input[offset];
            }
        });
    }

    static java.lang.String escapeText(java.lang.String input) {
        return escapeBytes(androidx.datastore.preferences.protobuf.ByteString.copyFromUtf8(input));
    }

    static java.lang.String escapeDoubleQuotesAndBackslashes(java.lang.String input) {
        return input.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
