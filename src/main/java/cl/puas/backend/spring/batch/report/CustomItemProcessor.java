package cl.puas.backend.spring.batch.report;

import cl.puas.backend.spring.batch.dto.Report;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by Bennu Ltda.
 * User: Sergio Puas
 * Date: 10-09-13
 */
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report item) throws Exception {

        System.out.println("Processing..." + item);
        return item;
    }
}
