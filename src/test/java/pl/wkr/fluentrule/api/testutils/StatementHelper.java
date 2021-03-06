package pl.wkr.fluentrule.api.testutils;

import org.junit.runners.model.Statement;

public abstract class StatementHelper {

    public static Throwable evaluateGetException(Statement s) {
        try {
            s.evaluate();
        }  catch(Throwable e) {
            return e;
        }
        return null;
    }
}
