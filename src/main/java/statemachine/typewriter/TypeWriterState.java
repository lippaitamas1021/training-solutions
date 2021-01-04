package statemachine.typewriter;

import typeconversion.whichtype.Type;

public enum TypeWriterState {

    UPPERCASE {
        @Override
        TypeWriterState next() {
            return TypeWriterState.LOWERCASE;
        }
    },
    LOWERCASE {
        TypeWriterState next() {
            return TypeWriterState.UPPERCASE;
        }
    };

    abstract TypeWriterState next();
}
