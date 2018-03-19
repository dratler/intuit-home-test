package com.intuit;

import com.intuit.engine.Scheduler;
import com.intuit.moduls.KafkaConsumerProps;
import com.intuit.moduls.KafkaProducer;
import com.intuit.rest.route.PaymentRoute;
import org.jooby.Jooby;
import org.jooby.jdbc.Jdbc;
import org.jooby.jooq.jOOQ;
import org.jooby.json.Gzon;
import org.jooby.quartz.Quartz;

/**
 * @author jooby generator
 */
public class App extends Jooby {
    {
        //route's
        use(PaymentRoute.class);

        //Modules
        //This is the Message Queue Modules
        use(new KafkaProducer());
        use(new KafkaConsumerProps());

        //Parser
        use(new Gzon());

        //Engine Entry Point
        use(new Quartz(Scheduler.class));

        //Database
        use(new Jdbc());
        use(new jOOQ());

        //Adding Mock Data
        assets("/json/**");

    }

    public static void main(final String[] args) {

    run(App::new, args);
  }

}
