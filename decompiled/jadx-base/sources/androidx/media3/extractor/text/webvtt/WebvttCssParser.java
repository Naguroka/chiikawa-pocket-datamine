package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
final class WebvttCssParser {
    private static final java.lang.String PROPERTY_BGCOLOR = "background-color";
    private static final java.lang.String PROPERTY_COLOR = "color";
    private static final java.lang.String PROPERTY_FONT_FAMILY = "font-family";
    private static final java.lang.String PROPERTY_FONT_SIZE = "font-size";
    private static final java.lang.String PROPERTY_FONT_STYLE = "font-style";
    private static final java.lang.String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final java.lang.String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final java.lang.String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final java.lang.String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final java.lang.String RULE_END = "}";
    private static final java.lang.String RULE_START = "{";
    private static final java.lang.String TAG = "WebvttCssParser";
    private static final java.lang.String VALUE_ALL = "all";
    private static final java.lang.String VALUE_BOLD = "bold";
    private static final java.lang.String VALUE_DIGITS = "digits";
    private static final java.lang.String VALUE_ITALIC = "italic";
    private static final java.lang.String VALUE_OVER = "over";
    private static final java.lang.String VALUE_UNDER = "under";
    private static final java.lang.String VALUE_UNDERLINE = "underline";
    private static final java.util.regex.Pattern VOICE_NAME_PATTERN = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final java.util.regex.Pattern FONT_SIZE_PATTERN = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final androidx.media3.common.util.ParsableByteArray styleInput = new androidx.media3.common.util.ParsableByteArray();
    private final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();

    public java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> parseBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String selector = parseSelector(this.styleInput, this.stringBuilder);
            if (selector == null || !RULE_START.equals(parseNextToken(this.styleInput, this.stringBuilder))) {
                return arrayList;
            }
            androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle = new androidx.media3.extractor.text.webvtt.WebvttCssStyle();
            applySelectorToStyle(webvttCssStyle, selector);
            java.lang.String str = null;
            boolean z = false;
            while (!z) {
                int position2 = this.styleInput.getPosition();
                java.lang.String nextToken = parseNextToken(this.styleInput, this.stringBuilder);
                boolean z2 = nextToken == null || RULE_END.equals(nextToken);
                if (!z2) {
                    this.styleInput.setPosition(position2);
                    parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
                }
                str = nextToken;
                z = z2;
            }
            if (RULE_END.equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
    }

    private static java.lang.String parseSelector(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        java.lang.String nextToken = parseNextToken(parsableByteArray, sb);
        if (nextToken == null) {
            return null;
        }
        if (RULE_START.equals(nextToken)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        java.lang.String cueTarget = "(".equals(nextToken) ? readCueTarget(parsableByteArray) : null;
        if (")".equals(parseNextToken(parsableByteArray, sb))) {
            return cueTarget;
        }
        return null;
    }

    private static java.lang.String readCueTarget(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        boolean z = false;
        while (position < iLimit && !z) {
            int i = position + 1;
            z = ((char) parsableByteArray.getData()[position]) == ')';
            position = i;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    private static void parseStyleDeclaration(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        java.lang.String identifier = parseIdentifier(parsableByteArray, sb);
        if (!"".equals(identifier) && ":".equals(parseNextToken(parsableByteArray, sb))) {
            skipWhitespaceAndComments(parsableByteArray);
            java.lang.String propertyValue = parsePropertyValue(parsableByteArray, sb);
            if (propertyValue == null || "".equals(propertyValue)) {
                return;
            }
            int position = parsableByteArray.getPosition();
            java.lang.String nextToken = parseNextToken(parsableByteArray, sb);
            if (!";".equals(nextToken)) {
                if (!RULE_END.equals(nextToken)) {
                    return;
                } else {
                    parsableByteArray.setPosition(position);
                }
            }
            if ("color".equals(identifier)) {
                webvttCssStyle.setFontColor(androidx.media3.common.util.ColorParser.parseCssColor(propertyValue));
                return;
            }
            if (PROPERTY_BGCOLOR.equals(identifier)) {
                webvttCssStyle.setBackgroundColor(androidx.media3.common.util.ColorParser.parseCssColor(propertyValue));
                return;
            }
            boolean z = true;
            if (PROPERTY_RUBY_POSITION.equals(identifier)) {
                if (VALUE_OVER.equals(propertyValue)) {
                    webvttCssStyle.setRubyPosition(1);
                    return;
                } else {
                    if (VALUE_UNDER.equals(propertyValue)) {
                        webvttCssStyle.setRubyPosition(2);
                        return;
                    }
                    return;
                }
            }
            if (PROPERTY_TEXT_COMBINE_UPRIGHT.equals(identifier)) {
                if (!"all".equals(propertyValue) && !propertyValue.startsWith(VALUE_DIGITS)) {
                    z = false;
                }
                webvttCssStyle.setCombineUpright(z);
                return;
            }
            if (PROPERTY_TEXT_DECORATION.equals(identifier)) {
                if ("underline".equals(propertyValue)) {
                    webvttCssStyle.setUnderline(true);
                    return;
                }
                return;
            }
            if (PROPERTY_FONT_FAMILY.equals(identifier)) {
                webvttCssStyle.setFontFamily(propertyValue);
                return;
            }
            if (PROPERTY_FONT_WEIGHT.equals(identifier)) {
                if ("bold".equals(propertyValue)) {
                    webvttCssStyle.setBold(true);
                }
            } else if (PROPERTY_FONT_STYLE.equals(identifier)) {
                if ("italic".equals(propertyValue)) {
                    webvttCssStyle.setItalic(true);
                }
            } else if (PROPERTY_FONT_SIZE.equals(identifier)) {
                parseFontSize(propertyValue, webvttCssStyle);
            }
        }
    }

    static void skipWhitespaceAndComments(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.bytesLeft() > 0 && z; z = false) {
                if (!maybeSkipWhitespace(parsableByteArray) && !maybeSkipComment(parsableByteArray)) {
                }
            }
            return;
        }
    }

    static java.lang.String parseNextToken(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        java.lang.String identifier = parseIdentifier(parsableByteArray, sb);
        return !"".equals(identifier) ? identifier : "" + ((char) parsableByteArray.readUnsignedByte());
    }

    private static boolean maybeSkipWhitespace(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        char cPeekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (cPeekCharAtPosition != '\t' && cPeekCharAtPosition != '\n' && cPeekCharAtPosition != '\f' && cPeekCharAtPosition != '\r' && cPeekCharAtPosition != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    static void skipStyleBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (!android.text.TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    private static char peekCharAtPosition(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        return (char) parsableByteArray.getData()[i];
    }

    private static java.lang.String parsePropertyValue(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        boolean z = false;
        while (!z) {
            int position = parsableByteArray.getPosition();
            java.lang.String nextToken = parseNextToken(parsableByteArray, sb);
            if (nextToken == null) {
                return null;
            }
            if (RULE_END.equals(nextToken) || ";".equals(nextToken)) {
                parsableByteArray.setPosition(position);
                z = true;
            } else {
                sb2.append(nextToken);
            }
        }
        return sb2.toString();
    }

    private static boolean maybeSkipComment(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        if (position + 2 > iLimit) {
            return false;
        }
        int i = position + 1;
        if (data[position] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (data[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 < iLimit) {
                if (((char) data[i2]) == '*' && ((char) data[i3]) == '/') {
                    i2 = i3 + 1;
                    iLimit = i2;
                } else {
                    i2 = i3;
                }
            } else {
                parsableByteArray.skipBytes(iLimit - parsableByteArray.getPosition());
                return true;
            }
        }
    }

    private static java.lang.String parseIdentifier(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && !z) {
            char c = (char) parsableByteArray.getData()[position];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                position++;
                sb.append(c);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    private static void parseFontSize(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle) {
        java.util.regex.Matcher matcher = FONT_SIZE_PATTERN.matcher(com.google.common.base.Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w(TAG, "Invalid font-size: '" + str + "'.");
            return;
        }
        java.lang.String str2 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                webvttCssStyle.setFontSizeUnit(3);
                break;
            case "em":
                webvttCssStyle.setFontSizeUnit(2);
                break;
            case "px":
                webvttCssStyle.setFontSizeUnit(1);
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        webvttCssStyle.setFontSize(java.lang.Float.parseFloat((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))));
    }

    private void applySelectorToStyle(androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle, java.lang.String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            java.util.regex.Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(str, "\\.");
        java.lang.String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, iIndexOf2));
            webvttCssStyle.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            webvttCssStyle.setTargetClasses((java.lang.String[]) androidx.media3.common.util.Util.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }
}
