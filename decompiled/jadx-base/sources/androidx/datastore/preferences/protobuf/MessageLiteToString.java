package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
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

    static java.lang.String toString(androidx.datastore.preferences.protobuf.MessageLite messageLite, java.lang.String commentString) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ").append(commentString);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }

    private static void reflectivePrintWithIndent(androidx.datastore.preferences.protobuf.MessageLite messageLite, java.lang.StringBuilder buffer, int indent) {
        int i;
        int i2;
        boolean zBooleanValue;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i3 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(i);
            if (strSubstring.endsWith(LIST_SUFFIX) && !strSubstring.endsWith(BUILDER_LIST_SUFFIX) && !strSubstring.equals(LIST_SUFFIX) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                printField(buffer, indent, strSubstring.substring(0, strSubstring.length() - 4), androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(method2, messageLite, new java.lang.Object[0]));
                i = 3;
            } else {
                if (strSubstring.endsWith(MAP_SUFFIX) && !strSubstring.equals(MAP_SUFFIX) && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                    i2 = 3;
                    printField(buffer, indent, strSubstring.substring(0, strSubstring.length() - 3), androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(method, messageLite, new java.lang.Object[0]));
                } else {
                    i2 = 3;
                    if (hashSet.contains("set" + strSubstring) && (!strSubstring.endsWith(BYTES_SUFFIX) || !treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5)))) {
                        java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                        java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                        if (method4 != null) {
                            java.lang.Object objInvokeOrDie = androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(method4, messageLite, new java.lang.Object[0]);
                            if (method5 == null) {
                                zBooleanValue = !isDefaultValue(objInvokeOrDie);
                            } else {
                                zBooleanValue = ((java.lang.Boolean) androidx.datastore.preferences.protobuf.GeneratedMessageLite.invokeOrDie(method5, messageLite, new java.lang.Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                printField(buffer, indent, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        if (messageLite instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) {
            java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                printField(buffer, indent, com.ironsource.y8.i.d + ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) entry2.getKey()).getNumber() + com.ironsource.y8.i.e, entry2.getValue());
            }
        }
        androidx.datastore.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.printWithIndent(buffer, indent);
        }
    }

    private static boolean isDefaultValue(java.lang.Object o) {
        if (o instanceof java.lang.Boolean) {
            return !((java.lang.Boolean) o).booleanValue();
        }
        if (o instanceof java.lang.Integer) {
            return ((java.lang.Integer) o).intValue() == 0;
        }
        if (o instanceof java.lang.Float) {
            return java.lang.Float.floatToRawIntBits(((java.lang.Float) o).floatValue()) == 0;
        }
        if (o instanceof java.lang.Double) {
            return java.lang.Double.doubleToRawLongBits(((java.lang.Double) o).doubleValue()) == 0;
        }
        if (o instanceof java.lang.String) {
            return o.equals("");
        }
        if (o instanceof androidx.datastore.preferences.protobuf.ByteString) {
            return o.equals(androidx.datastore.preferences.protobuf.ByteString.EMPTY);
        }
        if (o instanceof androidx.datastore.preferences.protobuf.MessageLite) {
            return o == ((androidx.datastore.preferences.protobuf.MessageLite) o).getDefaultInstanceForType();
        }
        return (o instanceof java.lang.Enum) && ((java.lang.Enum) o).ordinal() == 0;
    }

    static void printField(java.lang.StringBuilder buffer, int indent, java.lang.String name, java.lang.Object object) {
        if (object instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) object).iterator();
            while (it.hasNext()) {
                printField(buffer, indent, name, it.next());
            }
            return;
        }
        if (object instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) object).entrySet().iterator();
            while (it2.hasNext()) {
                printField(buffer, indent, name, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        buffer.append('\n');
        indent(indent, buffer);
        buffer.append(pascalCaseToSnakeCase(name));
        if (object instanceof java.lang.String) {
            buffer.append(": \"").append(androidx.datastore.preferences.protobuf.TextFormatEscaper.escapeText((java.lang.String) object)).append(kotlin.text.Typography.quote);
            return;
        }
        if (object instanceof androidx.datastore.preferences.protobuf.ByteString) {
            buffer.append(": \"").append(androidx.datastore.preferences.protobuf.TextFormatEscaper.escapeBytes((androidx.datastore.preferences.protobuf.ByteString) object)).append(kotlin.text.Typography.quote);
            return;
        }
        if (object instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
            buffer.append(" {");
            reflectivePrintWithIndent((androidx.datastore.preferences.protobuf.GeneratedMessageLite) object, buffer, indent + 2);
            buffer.append("\n");
            indent(indent, buffer);
            buffer.append("}");
            return;
        }
        if (object instanceof java.util.Map.Entry) {
            buffer.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            int i = indent + 2;
            printField(buffer, i, com.ironsource.y8.h.W, entry.getKey());
            printField(buffer, i, "value", entry.getValue());
            buffer.append("\n");
            indent(indent, buffer);
            buffer.append("}");
            return;
        }
        buffer.append(": ").append(object);
    }

    private static void indent(int indent, java.lang.StringBuilder buffer) {
        while (indent > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = indent > cArr.length ? cArr.length : indent;
            buffer.append(cArr, 0, length);
            indent -= length;
        }
    }

    private static java.lang.String pascalCaseToSnakeCase(java.lang.String pascalCase) {
        if (pascalCase.isEmpty()) {
            return pascalCase;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(pascalCase.charAt(0)));
        for (int i = 1; i < pascalCase.length(); i++) {
            char cCharAt = pascalCase.charAt(i);
            if (java.lang.Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
