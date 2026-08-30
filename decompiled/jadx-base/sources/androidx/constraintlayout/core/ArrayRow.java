package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class ArrayRow implements androidx.constraintlayout.core.LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public androidx.constraintlayout.core.ArrayRow.ArrayRowVariables variables;
    androidx.constraintlayout.core.SolverVariable variable = null;
    float constantValue = 0.0f;
    boolean used = false;
    java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> variablesToUpdate = new java.util.ArrayList<>();
    boolean isSimpleDefinition = false;

    public interface ArrayRowVariables {
        void add(androidx.constraintlayout.core.SolverVariable solverVariable, float f, boolean z);

        void clear();

        boolean contains(androidx.constraintlayout.core.SolverVariable solverVariable);

        void display();

        void divideByAmount(float f);

        float get(androidx.constraintlayout.core.SolverVariable solverVariable);

        int getCurrentSize();

        androidx.constraintlayout.core.SolverVariable getVariable(int i);

        float getVariableValue(int i);

        int indexOf(androidx.constraintlayout.core.SolverVariable solverVariable);

        void invert();

        void put(androidx.constraintlayout.core.SolverVariable solverVariable, float f);

        float remove(androidx.constraintlayout.core.SolverVariable solverVariable, boolean z);

        int sizeInBytes();

        float use(androidx.constraintlayout.core.ArrayRow arrayRow, boolean z);
    }

    public ArrayRow() {
    }

    public ArrayRow(androidx.constraintlayout.core.Cache cache) {
        this.variables = new androidx.constraintlayout.core.ArrayLinkedVariables(this, cache);
    }

    boolean hasKeyVariable() {
        androidx.constraintlayout.core.SolverVariable solverVariable = this.variable;
        return solverVariable != null && (solverVariable.mType == androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED || this.constantValue >= 0.0f);
    }

    public java.lang.String toString() {
        return toReadableString();
    }

    java.lang.String toReadableString() {
        boolean z;
        java.lang.String str = (this.variable == null ? "0" : "" + this.variable) + " = ";
        if (this.constantValue != 0.0f) {
            str = str + this.constantValue;
            z = true;
        } else {
            z = false;
        }
        int currentSize = this.variables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
            if (variable != null) {
                float variableValue = this.variables.getVariableValue(i);
                if (variableValue != 0.0f) {
                    java.lang.String string = variable.toString();
                    if (z) {
                        if (variableValue > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            variableValue *= -1.0f;
                        }
                    } else if (variableValue < 0.0f) {
                        str = str + "- ";
                        variableValue *= -1.0f;
                    }
                    if (variableValue == 1.0f) {
                        str = str + string;
                    } else {
                        str = str + variableValue + " " + string;
                    }
                    z = true;
                }
            }
        }
        return !z ? str + com.google.firebase.crashlytics.internal.common.IdManager.DEFAULT_VERSION_NAME : str;
    }

    public void reset() {
        this.variable = null;
        this.variables.clear();
        this.constantValue = 0.0f;
        this.isSimpleDefinition = false;
    }

    boolean hasVariable(androidx.constraintlayout.core.SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    androidx.constraintlayout.core.ArrayRow createRowDefinition(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        this.variable = solverVariable;
        float f = i;
        solverVariable.computedValue = f;
        this.constantValue = f;
        this.isSimpleDefinition = true;
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowEquals(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.constantValue = i * (-1);
            this.variables.put(solverVariable, 1.0f);
        } else {
            this.constantValue = i;
            this.variables.put(solverVariable, -1.0f);
        }
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowEquals(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.constantValue = i;
        }
        if (!z) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        }
        return this;
    }

    androidx.constraintlayout.core.ArrayRow addSingleError(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        this.variables.put(solverVariable, i);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowGreaterThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.constantValue = i;
        }
        if (!z) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowGreaterThan(androidx.constraintlayout.core.SolverVariable solverVariable, int i, androidx.constraintlayout.core.SolverVariable solverVariable2) {
        this.constantValue = i;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowLowerThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.constantValue = i;
        }
        if (!z) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
        }
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowEqualMatchDimensions(float f, float f2, float f3, androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4) {
        this.constantValue = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f4);
            this.variables.put(solverVariable3, -f4);
        }
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowEqualDimension(float f, float f2, float f3, androidx.constraintlayout.core.SolverVariable solverVariable, int i, androidx.constraintlayout.core.SolverVariable solverVariable2, int i2, androidx.constraintlayout.core.SolverVariable solverVariable3, int i3, androidx.constraintlayout.core.SolverVariable solverVariable4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.constantValue = ((-i) - i2) + i3 + i4;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.constantValue = ((-i) - i2) + (i3 * f4) + (i4 * f4);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f4);
            this.variables.put(solverVariable3, -f4);
        }
        return this;
    }

    androidx.constraintlayout.core.ArrayRow createRowCentering(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, float f, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.constantValue = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.constantValue = i;
        } else if (f >= 1.0f) {
            this.variables.put(solverVariable4, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            this.constantValue = -i2;
        } else {
            float f2 = 1.0f - f;
            this.variables.put(solverVariable, f2 * 1.0f);
            this.variables.put(solverVariable2, f2 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f);
            this.variables.put(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.constantValue = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow addError(androidx.constraintlayout.core.LinearSystem linearSystem, int i) {
        this.variables.put(linearSystem.createErrorVariable(i, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i, "em"), -1.0f);
        return this;
    }

    androidx.constraintlayout.core.ArrayRow createRowDimensionPercent(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, float f) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowDimensionRatio(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, float f) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f);
        this.variables.put(solverVariable4, -f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowWithAngle(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, float f) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.constantValue = -f;
        return this;
    }

    int sizeInBytes() {
        return (this.variable != null ? 4 : 0) + 4 + 4 + this.variables.sizeInBytes();
    }

    void ensurePositiveConstant() {
        float f = this.constantValue;
        if (f < 0.0f) {
            this.constantValue = f * (-1.0f);
            this.variables.invert();
        }
    }

    boolean chooseSubject(androidx.constraintlayout.core.LinearSystem linearSystem) {
        boolean z;
        androidx.constraintlayout.core.SolverVariable solverVariableChooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (solverVariableChooseSubjectInVariables == null) {
            z = true;
        } else {
            pivot(solverVariableChooseSubjectInVariables);
            z = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
        }
        return z;
    }

    androidx.constraintlayout.core.SolverVariable chooseSubjectInVariables(androidx.constraintlayout.core.LinearSystem linearSystem) {
        int currentSize = this.variables.getCurrentSize();
        androidx.constraintlayout.core.SolverVariable solverVariable = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        androidx.constraintlayout.core.SolverVariable solverVariable2 = null;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.variables.getVariableValue(i);
            androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
            if (variable.mType == androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f > variableValue) {
                    boolean zIsNew = isNew(variable, linearSystem);
                    z = zIsNew;
                    f = variableValue;
                    solverVariable = variable;
                } else if (!z && isNew(variable, linearSystem)) {
                    f = variableValue;
                    solverVariable = variable;
                    z = true;
                }
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null || f2 > variableValue) {
                    boolean zIsNew2 = isNew(variable, linearSystem);
                    z2 = zIsNew2;
                    f2 = variableValue;
                    solverVariable2 = variable;
                } else if (!z2 && isNew(variable, linearSystem)) {
                    f2 = variableValue;
                    solverVariable2 = variable;
                    z2 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    private boolean isNew(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    void pivot(androidx.constraintlayout.core.SolverVariable solverVariable) {
        androidx.constraintlayout.core.SolverVariable solverVariable2 = this.variable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.variable.definitionId = -1;
            this.variable = null;
        }
        float fRemove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.variable = solverVariable;
        if (fRemove == 1.0f) {
            return;
        }
        this.constantValue /= fRemove;
        this.variables.divideByAmount(fRemove);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.variable == null && this.constantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.ArrayRow arrayRow, boolean z) {
        this.constantValue += arrayRow.constantValue * this.variables.use(arrayRow, z);
        if (z) {
            arrayRow.variable.removeFromRow(this);
        }
        if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        this.constantValue += solverVariable.computedValue * this.variables.get(solverVariable);
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.isSynonym) {
            return;
        }
        float f = this.variables.get(solverVariable);
        this.constantValue += solverVariable.synonymDelta * f;
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.synonym], f, z);
        if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    private androidx.constraintlayout.core.SolverVariable pickPivotInVariables(boolean[] zArr, androidx.constraintlayout.core.SolverVariable solverVariable) {
        int currentSize = this.variables.getCurrentSize();
        androidx.constraintlayout.core.SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.variables.getVariableValue(i);
            if (variableValue < 0.0f) {
                androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && ((variable.mType == androidx.constraintlayout.core.SolverVariable.Type.SLACK || variable.mType == androidx.constraintlayout.core.SolverVariable.Type.ERROR) && variableValue < f)) {
                    f = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public androidx.constraintlayout.core.SolverVariable pickPivot(androidx.constraintlayout.core.SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.variable = null;
        this.constantValue = 0.0f;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(androidx.constraintlayout.core.LinearSystem.Row row) {
        if (row instanceof androidx.constraintlayout.core.ArrayRow) {
            androidx.constraintlayout.core.ArrayRow arrayRow = (androidx.constraintlayout.core.ArrayRow) row;
            this.variable = null;
            this.variables.clear();
            for (int i = 0; i < arrayRow.variables.getCurrentSize(); i++) {
                this.variables.add(arrayRow.variables.getVariable(i), arrayRow.variables.getVariableValue(i), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.strength != 1) {
            if (solverVariable.strength == 2) {
                f = 1000.0f;
            } else if (solverVariable.strength == 3) {
                f = 1000000.0f;
            } else if (solverVariable.strength == 4) {
                f = 1.0E9f;
            } else if (solverVariable.strength == 5) {
                f = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getKey() {
        return this.variable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(androidx.constraintlayout.core.LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int currentSize = this.variables.getCurrentSize();
            for (int i = 0; i < currentSize; i++) {
                androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
                if (variable.definitionId != -1 || variable.isFinalValue || variable.isSynonym) {
                    this.variablesToUpdate.add(variable);
                }
            }
            int size = this.variablesToUpdate.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.constraintlayout.core.SolverVariable solverVariable = this.variablesToUpdate.get(i2);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.isSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.definitionId], true);
                    }
                }
                this.variablesToUpdate.clear();
            } else {
                z = true;
            }
        }
        if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }
}
