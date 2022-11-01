package core.basesyntax.service;

import core.basesyntax.strategy.transactions.FruitTransaction;
import java.util.List;

public interface TransactionService {
    void applyTransactions(List<FruitTransaction> actions);
}
