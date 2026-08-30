package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParser {
    static boolean DEBUG = false;
    private boolean hasComment = false;
    private int lineNumber;
    private java.lang.String mContent;

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static androidx.constraintlayout.core.parser.CLObject parse(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        return new androidx.constraintlayout.core.parser.CLParser(str).parse();
    }

    public CLParser(java.lang.String str) {
        this.mContent = str;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0150 A[EDGE_INSN: B:106:0x0150->B:116:? BREAK  A[LOOP:1: B:14:0x0036->B:86:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x012a  */
    public androidx.constraintlayout.core.parser.CLObject parse() throws androidx.constraintlayout.core.parser.CLParsingException {
        boolean z;
        char c;
        long j;
        androidx.constraintlayout.core.parser.CLToken cLToken;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.lineNumber = 1;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c2 = charArray[i2];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.lineNumber++;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new androidx.constraintlayout.core.parser.CLParsingException("invalid json content", null);
        }
        androidx.constraintlayout.core.parser.CLObject cLObjectAllocate = androidx.constraintlayout.core.parser.CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.lineNumber);
        cLObjectAllocate.setStart(i2);
        int i3 = i2 + 1;
        androidx.constraintlayout.core.parser.CLElement container = cLObjectAllocate;
        while (i3 < length) {
            char c3 = charArray[i3];
            if (c3 == '\n') {
                this.lineNumber += i;
            }
            if (this.hasComment) {
                if (c3 == '\n') {
                    this.hasComment = z2;
                    if (container == null) {
                        break;
                        break;
                    }
                    if (container.isDone()) {
                        container = getNextJsonElement(i3, c3, container, charArray);
                    } else if (container instanceof androidx.constraintlayout.core.parser.CLObject) {
                        if (c3 == '}') {
                            container.setEnd(i3 - 1);
                        } else {
                            container = getNextJsonElement(i3, c3, container, charArray);
                        }
                    } else if (container instanceof androidx.constraintlayout.core.parser.CLArray) {
                        z = container instanceof androidx.constraintlayout.core.parser.CLString;
                        if (z) {
                            if (charArray[(int) container.start] == c3) {
                                container.setStart(container.start + 1);
                                container.setEnd(i3 - 1);
                            }
                        } else {
                            if (container instanceof androidx.constraintlayout.core.parser.CLToken) {
                                cLToken = (androidx.constraintlayout.core.parser.CLToken) container;
                                if (!cLToken.validate(c3, i3)) {
                                    throw new androidx.constraintlayout.core.parser.CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.lineNumber, cLToken);
                                }
                            }
                            if (!(container instanceof androidx.constraintlayout.core.parser.CLKey)) {
                                container.setStart(container.start + 1);
                                container.setEnd(i3 - 1);
                            } else {
                                container.setStart(container.start + 1);
                                container.setEnd(i3 - 1);
                            }
                            if (!container.isDone()) {
                                j = i3 - 1;
                                container.setEnd(j);
                                if (c3 != '}') {
                                    container = container.getContainer();
                                    container.setEnd(j);
                                    if (container instanceof androidx.constraintlayout.core.parser.CLKey) {
                                        container = container.getContainer();
                                        container.setEnd(j);
                                    }
                                } else {
                                    container = container.getContainer();
                                    container.setEnd(j);
                                    if (container instanceof androidx.constraintlayout.core.parser.CLKey) {
                                        container = container.getContainer();
                                        container.setEnd(j);
                                    }
                                }
                            }
                        }
                    } else if (c3 == ']') {
                        container.setEnd(i3 - 1);
                    } else {
                        container = getNextJsonElement(i3, c3, container, charArray);
                    }
                    if (!container.isDone()) {
                    }
                } else {
                    continue;
                }
            } else {
                if (container == null) {
                    break;
                }
                if (container.isDone()) {
                    container = getNextJsonElement(i3, c3, container, charArray);
                } else if (container instanceof androidx.constraintlayout.core.parser.CLObject) {
                    if (c3 == '}') {
                        container.setEnd(i3 - 1);
                    } else {
                        container = getNextJsonElement(i3, c3, container, charArray);
                    }
                } else if (container instanceof androidx.constraintlayout.core.parser.CLArray) {
                    z = container instanceof androidx.constraintlayout.core.parser.CLString;
                    if (z) {
                        if (charArray[(int) container.start] == c3) {
                            container.setStart(container.start + 1);
                            container.setEnd(i3 - 1);
                        }
                    } else {
                        if (container instanceof androidx.constraintlayout.core.parser.CLToken) {
                            cLToken = (androidx.constraintlayout.core.parser.CLToken) container;
                            if (!cLToken.validate(c3, i3)) {
                                throw new androidx.constraintlayout.core.parser.CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.lineNumber, cLToken);
                            }
                        }
                        if ((!(container instanceof androidx.constraintlayout.core.parser.CLKey) || z) && (((c = charArray[(int) container.start]) == '\'' || c == '\"') && c == c3)) {
                            container.setStart(container.start + 1);
                            container.setEnd(i3 - 1);
                        }
                        if (!container.isDone() && (c3 == '}' || c3 == ']' || c3 == ',' || c3 == ' ' || c3 == '\t' || c3 == '\r' || c3 == '\n' || c3 == ':')) {
                            j = i3 - 1;
                            container.setEnd(j);
                            if (c3 != '}' || c3 == ']') {
                                container = container.getContainer();
                                container.setEnd(j);
                                if (container instanceof androidx.constraintlayout.core.parser.CLKey) {
                                    container = container.getContainer();
                                    container.setEnd(j);
                                }
                            }
                        }
                    }
                } else if (c3 == ']') {
                    container.setEnd(i3 - 1);
                } else {
                    container = getNextJsonElement(i3, c3, container, charArray);
                }
                if (!container.isDone() && (!(container instanceof androidx.constraintlayout.core.parser.CLKey) || ((androidx.constraintlayout.core.parser.CLKey) container).mElements.size() > 0)) {
                    container = container.getContainer();
                }
            }
            i3++;
            i = 1;
            z2 = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof androidx.constraintlayout.core.parser.CLString) {
                container.setStart(((int) container.start) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        if (DEBUG) {
            java.lang.System.out.println("Root: " + cLObjectAllocate.toJSON());
        }
        return cLObjectAllocate;
    }

    private androidx.constraintlayout.core.parser.CLElement getNextJsonElement(int i, char c, androidx.constraintlayout.core.parser.CLElement cLElement, char[] cArr) throws androidx.constraintlayout.core.parser.CLParsingException {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return cLElement;
        }
        if (c == '\"' || c == '\'') {
            if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
                return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.STRING, true, cArr);
        }
        if (c == '[') {
            return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY, true, cArr);
        }
        if (c != ']') {
            if (c == '{') {
                return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT, true, cArr);
            }
            if (c != '}') {
                switch (c) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return cLElement;
                    case '/':
                        int i2 = i + 1;
                        if (i2 >= cArr.length || cArr[i2] != '/') {
                            return cLElement;
                        }
                        this.hasComment = true;
                        return cLElement;
                    default:
                        if ((cLElement instanceof androidx.constraintlayout.core.parser.CLContainer) && !(cLElement instanceof androidx.constraintlayout.core.parser.CLObject)) {
                            androidx.constraintlayout.core.parser.CLElement cLElementCreateElement = createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN, true, cArr);
                            androidx.constraintlayout.core.parser.CLToken cLToken = (androidx.constraintlayout.core.parser.CLToken) cLElementCreateElement;
                            if (cLToken.validate(c, i)) {
                                return cLElementCreateElement;
                            }
                            throw new androidx.constraintlayout.core.parser.CLParsingException("incorrect token <" + c + "> at line " + this.lineNumber, cLToken);
                        }
                        return createElement(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.KEY, true, cArr);
                }
            }
        }
        cLElement.setEnd(i - 1);
        androidx.constraintlayout.core.parser.CLElement container = cLElement.getContainer();
        container.setEnd(i);
        return container;
    }

    private androidx.constraintlayout.core.parser.CLElement createElement(androidx.constraintlayout.core.parser.CLElement cLElement, int i, androidx.constraintlayout.core.parser.CLParser.TYPE type, boolean z, char[] cArr) {
        androidx.constraintlayout.core.parser.CLElement cLElementAllocate;
        if (DEBUG) {
            java.lang.System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (androidx.constraintlayout.core.parser.CLParser.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[type.ordinal()]) {
            case 1:
                cLElementAllocate = androidx.constraintlayout.core.parser.CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                cLElementAllocate = androidx.constraintlayout.core.parser.CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                cLElementAllocate = androidx.constraintlayout.core.parser.CLString.allocate(cArr);
                break;
            case 4:
                cLElementAllocate = androidx.constraintlayout.core.parser.CLNumber.allocate(cArr);
                break;
            case 5:
                cLElementAllocate = androidx.constraintlayout.core.parser.CLKey.allocate(cArr);
                break;
            case 6:
                cLElementAllocate = androidx.constraintlayout.core.parser.CLToken.allocate(cArr);
                break;
            default:
                cLElementAllocate = null;
                break;
        }
        if (cLElementAllocate == null) {
            return null;
        }
        cLElementAllocate.setLine(this.lineNumber);
        if (z) {
            cLElementAllocate.setStart(i);
        }
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLContainer) {
            cLElementAllocate.setContainer((androidx.constraintlayout.core.parser.CLContainer) cLElement);
        }
        return cLElementAllocate;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.CLParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.parser.CLParser.TYPE.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = iArr;
            try {
                iArr[androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.KEY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
