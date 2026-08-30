package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class MessageLiteToString {
    private static final java.lang.String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final java.lang.String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final java.lang.String LIST_SUFFIX = "List";
    private static final java.lang.String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    static java.lang.String toString(com.google.protobuf.MessageLite messageLite, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ").append(str);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }

    private static void reflectivePrintWithIndent(com.google.protobuf.MessageLite messageLite, java.lang.StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i4];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith(LIST_SUFFIX) && !strSubstring.endsWith(BUILDER_LIST_SUFFIX) && !strSubstring.equals(LIST_SUFFIX) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                printField(sb, i, strSubstring.substring(0, strSubstring.length() - 4), com.google.protobuf.GeneratedMessageLite.invokeOrDie(method2, messageLite, new java.lang.Object[0]));
                i2 = 3;
            } else {
                if (strSubstring.endsWith(MAP_SUFFIX) && !strSubstring.equals(MAP_SUFFIX) && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    printField(sb, i, strSubstring.substring(0, strSubstring.length() - 3), com.google.protobuf.GeneratedMessageLite.invokeOrDie(method, messageLite, new java.lang.Object[0]));
                } else {
                    i3 = 3;
                    if (hashSet.contains("set" + strSubstring) && (!strSubstring.endsWith(BYTES_SUFFIX) || !treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5)))) {
                        java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                        java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                        if (method4 != null) {
                            java.lang.Object objInvokeOrDie = com.google.protobuf.GeneratedMessageLite.invokeOrDie(method4, messageLite, new java.lang.Object[0]);
                            if (method5 == null) {
                                zBooleanValue = !isDefaultValue(objInvokeOrDie);
                            } else {
                                zBooleanValue = ((java.lang.Boolean) com.google.protobuf.GeneratedMessageLite.invokeOrDie(method5, messageLite, new java.lang.Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                printField(sb, i, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (messageLite instanceof com.google.protobuf.GeneratedMessageLite.ExtendableMessage) {
            java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                printField(sb, i, com.ironsource.y8.i.d + ((com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor) entry2.getKey()).getNumber() + com.ironsource.y8.i.e, entry2.getValue());
            }
        }
        com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.printWithIndent(sb, i);
        }
    }

    private static boolean isDefaultValue(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return !((java.lang.Boolean) obj).booleanValue();
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue() == 0;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()) == 0;
        }
        if (obj instanceof java.lang.Double) {
            return java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof java.lang.String) {
            return obj.equals("");
        }
        if (obj instanceof com.google.protobuf.ByteString) {
            return obj.equals(com.google.protobuf.ByteString.EMPTY);
        }
        if (obj instanceof com.google.protobuf.MessageLite) {
            return obj == ((com.google.protobuf.MessageLite) obj).getDefaultInstanceForType();
        }
        return (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    static void printField(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof java.lang.String) {
            sb.append(": \"").append(com.google.protobuf.TextFormatEscaper.escapeText((java.lang.String) obj)).append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.protobuf.ByteString) {
            sb.append(": \"").append(com.google.protobuf.TextFormatEscaper.escapeBytes((com.google.protobuf.ByteString) obj)).append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.protobuf.GeneratedMessageLite) {
            sb.append(" {");
            reflectivePrintWithIndent((com.google.protobuf.GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            indent(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof java.util.Map.Entry) {
            sb.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int i2 = i + 2;
            printField(sb, i2, com.ironsource.y8.h.W, entry.getKey());
            printField(sb, i2, "value", entry.getValue());
            sb.append("\n");
            indent(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ").append(obj);
    }

    private static void indent(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    private static java.lang.String pascalCaseToSnakeCase(java.lang.String str) {
        if (str.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
