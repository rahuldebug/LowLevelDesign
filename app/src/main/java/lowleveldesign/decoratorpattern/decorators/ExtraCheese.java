package lowleveldesign.decoratorpattern.decorators;

import lowleveldesign.decoratorpattern.base.BasePizza;

public class ExtraCheese extends BasePizza {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public float cost() {
        return this.basePizza.cost() + 50;
    }
}
