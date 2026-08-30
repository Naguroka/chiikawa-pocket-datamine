package androidx.constraintlayout.core.motion.parse;

/* JADX INFO: loaded from: classes.dex */
public class KeyParser {

    /* JADX INFO: Access modifiers changed from: private */
    interface DataType {
        int get(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface Ids {
        int get(java.lang.String str);
    }

    private static androidx.constraintlayout.core.motion.utils.TypedBundle parse(java.lang.String str, androidx.constraintlayout.core.motion.parse.KeyParser.Ids ids, androidx.constraintlayout.core.motion.parse.KeyParser.DataType dataType) {
        androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
        try {
            androidx.constraintlayout.core.parser.CLObject cLObject = androidx.constraintlayout.core.parser.CLParser.parse(str);
            int size = cLObject.size();
            for (int i = 0; i < size; i++) {
                androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) cLObject.get(i);
                java.lang.String strContent = cLKey.content();
                androidx.constraintlayout.core.parser.CLElement value = cLKey.getValue();
                int i2 = ids.get(strContent);
                if (i2 == -1) {
                    java.lang.System.err.println("unknown type " + strContent);
                } else {
                    int i3 = dataType.get(i2);
                    if (i3 == 1) {
                        typedBundle.add(i2, cLObject.getBoolean(i));
                    } else if (i3 == 2) {
                        typedBundle.add(i2, value.getInt());
                        java.lang.System.out.println("parse " + strContent + " INT_MASK > " + value.getInt());
                    } else if (i3 == 4) {
                        typedBundle.add(i2, value.getFloat());
                        java.lang.System.out.println("parse " + strContent + " FLOAT_MASK > " + value.getFloat());
                    } else if (i3 == 8) {
                        typedBundle.add(i2, value.content());
                        java.lang.System.out.println("parse " + strContent + " STRING_MASK > " + value.content());
                    }
                }
            }
        } catch (androidx.constraintlayout.core.parser.CLParsingException e) {
            e.printStackTrace();
        }
        return typedBundle;
    }

    public static androidx.constraintlayout.core.motion.utils.TypedBundle parseAttributes(java.lang.String str) {
        return parse(str, new androidx.constraintlayout.core.motion.parse.KeyParser.Ids() { // from class: androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda0
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
            public final int get(java.lang.String str2) {
                return androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(str2);
            }
        }, new androidx.constraintlayout.core.motion.parse.KeyParser.DataType() { // from class: androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda1
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
            public final int get(int i) {
                return androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getType(i);
            }
        });
    }

    public static void main(java.lang.String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }
}
