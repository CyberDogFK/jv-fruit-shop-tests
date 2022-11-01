package basesyntax.strategy.transactions.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.strategy.transactions.FruitTransaction;
import core.basesyntax.strategy.transactions.TransactionHandler;

public class ReduceHandler implements TransactionHandler {
    private final StorageDao storageDao;

    public ReduceHandler(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

    @Override
    public void apply(FruitTransaction fruitTransaction) {
        Integer oldValue = storageDao.getValue(fruitTransaction.getFruitName());
        Integer newValue = oldValue - fruitTransaction.getValueOfFruit();
        storageDao.setValue(fruitTransaction.getFruitName(),
                newValue);
    }
}
