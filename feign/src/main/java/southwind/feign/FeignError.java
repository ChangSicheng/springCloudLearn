package southwind.feign;

import org.springframework.stereotype.Component;
import southwind.FeignApplication;
import southwind.controller.FeignProviderClient;
import southwind.entity.Student;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public String index() {
        return "服务维护中......";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
