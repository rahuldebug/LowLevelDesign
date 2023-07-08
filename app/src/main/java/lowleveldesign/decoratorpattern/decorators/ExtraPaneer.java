package lowleveldesign.decoratorpattern.decorators;

import lowleveldesign.decoratorpattern.base.BasePizza;

public class ExtraPaneer extends BasePizza {
    BasePizza pizza;

    public ExtraPaneer(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public float cost() {
        return this.pizza.cost()+80;
    }
}
