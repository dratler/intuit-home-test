package com.intuit.rest;

import com.intuit.moduls.RabbitMq;
import com.intuit.rest.route.PaymentRoute;
import org.jooby.Jooby;
import org.jooby.json.Gzon;

/**
 * @author jooby generator
 */
public class App extends Jooby {
    {
        //route's
        use(PaymentRoute.class);

        //Modules
        use(RabbitMq.class);

        //Parser
        use(new Gzon());
    }

    public static void main(final String[] args) {

    run(App::new, args);
  }

}
