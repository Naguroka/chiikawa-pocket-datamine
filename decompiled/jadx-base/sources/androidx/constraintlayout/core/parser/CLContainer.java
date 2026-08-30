package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLContainer extends androidx.constraintlayout.core.parser.CLElement {
    java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> mElements;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.mElements = new java.util.ArrayList<>();
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLContainer(cArr);
    }

    public void add(androidx.constraintlayout.core.parser.CLElement cLElement) {
        this.mElements.add(cLElement);
        if (androidx.constraintlayout.core.parser.CLParser.DEBUG) {
            java.lang.System.out.println("added element " + cLElement + " to " + this);
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (androidx.constraintlayout.core.parser.CLElement cLElement : this.mElements) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement);
        }
        return super.toString() + " = <" + ((java.lang.Object) sb) + " >";
    }

    public int size() {
        return this.mElements.size();
    }

    public java.util.ArrayList<java.lang.String> names() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        for (androidx.constraintlayout.core.parser.CLElement cLElement : this.mElements) {
            if (cLElement instanceof androidx.constraintlayout.core.parser.CLKey) {
                arrayList.add(((androidx.constraintlayout.core.parser.CLKey) cLElement).content());
            }
        }
        return arrayList;
    }

    public boolean has(java.lang.String str) {
        for (androidx.constraintlayout.core.parser.CLElement cLElement : this.mElements) {
            if ((cLElement instanceof androidx.constraintlayout.core.parser.CLKey) && ((androidx.constraintlayout.core.parser.CLKey) cLElement).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void put(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) {
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) it.next();
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.mElements.add((androidx.constraintlayout.core.parser.CLKey) androidx.constraintlayout.core.parser.CLKey.allocate(str, cLElement));
    }

    public void putNumber(java.lang.String str, float f) {
        put(str, new androidx.constraintlayout.core.parser.CLNumber(f));
    }

    public void remove(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.constraintlayout.core.parser.CLElement cLElement : this.mElements) {
            if (((androidx.constraintlayout.core.parser.CLKey) cLElement).content().equals(str)) {
                arrayList.add(cLElement);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.mElements.remove((androidx.constraintlayout.core.parser.CLElement) it.next());
        }
    }

    public androidx.constraintlayout.core.parser.CLElement get(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no element for key <" + str + ">", this);
    }

    public int getInt(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no int found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public float getFloat(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no float found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public androidx.constraintlayout.core.parser.CLArray getArray(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLArray) {
            return (androidx.constraintlayout.core.parser.CLArray) cLElement;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no array found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public androidx.constraintlayout.core.parser.CLObject getObject(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
            return (androidx.constraintlayout.core.parser.CLObject) cLElement;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no object found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public java.lang.String getString(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
            return cLElement.content();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no string found for key <" + str + ">, found [" + (cLElement != null ? cLElement.getStrClass() : null) + "] : " + cLElement, this);
    }

    public boolean getBoolean(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(str);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLToken) {
            return ((androidx.constraintlayout.core.parser.CLToken) cLElement).getBoolean();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no boolean found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public androidx.constraintlayout.core.parser.CLElement getOrNull(java.lang.String str) {
        java.util.Iterator<androidx.constraintlayout.core.parser.CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public androidx.constraintlayout.core.parser.CLObject getObjectOrNull(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLObject) {
            return (androidx.constraintlayout.core.parser.CLObject) orNull;
        }
        return null;
    }

    public androidx.constraintlayout.core.parser.CLArray getArrayOrNull(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLArray) {
            return (androidx.constraintlayout.core.parser.CLArray) orNull;
        }
        return null;
    }

    public java.lang.String getStringOrNull(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLString) {
            return orNull.content();
        }
        return null;
    }

    public float getFloatOrNaN(java.lang.String str) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(str);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public androidx.constraintlayout.core.parser.CLElement get(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        if (i >= 0 && i < this.mElements.size()) {
            return this.mElements.get(i);
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no element at index " + i, this);
    }

    public int getInt(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no int at index " + i, this);
    }

    public float getFloat(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no float at index " + i, this);
    }

    public androidx.constraintlayout.core.parser.CLArray getArray(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLArray) {
            return (androidx.constraintlayout.core.parser.CLArray) cLElement;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no array at index " + i, this);
    }

    public androidx.constraintlayout.core.parser.CLObject getObject(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
            return (androidx.constraintlayout.core.parser.CLObject) cLElement;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no object at index " + i, this);
    }

    public java.lang.String getString(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
            return cLElement.content();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no string at index " + i, this);
    }

    public boolean getBoolean(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = get(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLToken) {
            return ((androidx.constraintlayout.core.parser.CLToken) cLElement).getBoolean();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("no boolean at index " + i, this);
    }

    public androidx.constraintlayout.core.parser.CLElement getOrNull(int i) {
        if (i < 0 || i >= this.mElements.size()) {
            return null;
        }
        return this.mElements.get(i);
    }

    public java.lang.String getStringOrNull(int i) {
        androidx.constraintlayout.core.parser.CLElement orNull = getOrNull(i);
        if (orNull instanceof androidx.constraintlayout.core.parser.CLString) {
            return orNull.content();
        }
        return null;
    }
}
