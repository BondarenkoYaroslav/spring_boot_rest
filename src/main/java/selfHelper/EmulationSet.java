package selfHelper;


import java.util.HashSet;
import java.util.Set;

public class EmulationSet {

    protected Set<String> getSpec() {
        Set<String> spec = new HashSet<>();
        spec.add("login");
        spec.add("account");
        spec.add("password");
        spec.add("birthday");
        spec.add("test");
        spec.add("secondTest");
        return spec;
    }

    protected Set<String> getApiSpecGeneration() {
        Set<String> apiSpec = new HashSet<>();
        for (String spec : getSpec()) {
            apiSpec.add("api/spec/" + spec.substring(0 , 1).toUpperCase() + spec.substring(1) + "API.java");
        }
        return apiSpec;
    }
    protected Set<String> getApiClientGeneration() {
        Set<String> apiSpec = new HashSet<>();
        for (String spec : getSpec()) {
            apiSpec.add("api/client/" + spec.substring(0 , 1).toUpperCase() + spec.substring(1) + "API.java");
        }
        return apiSpec;
    }

    protected Set<String> getDao() {
        Set<String> dao = new HashSet<>();
        dao.add("murgenResponce");
        dao.add("turgenEnum");
        dao.add("surgen");
        dao.add("purgen");
        dao.add("curgenEnum");
        dao.add("secondTest");
        return dao;
    }

}
