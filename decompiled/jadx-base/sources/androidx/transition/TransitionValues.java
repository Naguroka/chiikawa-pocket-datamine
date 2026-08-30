package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class TransitionValues {
    public android.view.View view;
    public final java.util.Map<java.lang.String, java.lang.Object> values = new java.util.HashMap();
    final java.util.ArrayList<androidx.transition.Transition> mTargetedTransitions = new java.util.ArrayList<>();

    @java.lang.Deprecated
    public TransitionValues() {
    }

    public TransitionValues(android.view.View view) {
        this.view = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.transition.TransitionValues)) {
            return false;
        }
        androidx.transition.TransitionValues transitionValues = (androidx.transition.TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + this.values.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = (("TransitionValues@" + java.lang.Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.view + "\n") + "    values:";
        for (java.lang.String str2 : this.values.keySet()) {
            str = str + "    " + str2 + ": " + this.values.get(str2) + "\n";
        }
        return str;
    }
}
