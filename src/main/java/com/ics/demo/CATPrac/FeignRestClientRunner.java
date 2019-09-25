package com.ics.demo.CATPrac;

import com.ics.demo.CATPrac.FeignRestClient;
import com.ics.demo.CATPrac.models.Attachment;
import com.ics.demo.CATPrac.models.Rejection;
import com.ics.demo.CATPrac.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignRestClientRunner implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public FeignRestClientRunner(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("just seeing if this works");

        Student me = feignRestClient.registerStudent(new Student("94622","Mari"));
            System.out.println(me.getId());
            Attachment myAttachment = feignRestClient.requestAttachment(me.getId(),5L);
            System.out.println(myAttachment.getId());

            myAttachment = feignRestClient.requestDepartment(me.getId(),15L,5L);
            System.out.println(myAttachment.getId());

            feignRestClient.rejectAppointment(new Rejection(me.getId(),15L,5L));

    }
}
