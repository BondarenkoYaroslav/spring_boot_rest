package selfHelper;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Component
public class ExpertGen {

    private Set<String> actualGeneration = new HashSet<>();
    private Set<String> allFilesInDirectories = new HashSet<>();

    public void cleaner() {
//        EmulationSet emulationSet = new EmulationSet();
//
//        for (String str : emulationSet.getApiSpecGeneration()) {
//            System.out.println(str);
//        }

        concatPathAndFileName("api/client");
    }

    private Set<String> getUnusedFiles() {
        Set<String> unusedFiles = new HashSet<>(getAllFilesInDirectories());
        unusedFiles.removeAll(getActualGeneration());
        return unusedFiles;
    }

    private void deleteFiles(final Set<String> filesToDelete) {
        for (String fileToDelete : filesToDelete) {
            deleteFile(fileToDelete);
        }
    }

    private void deleteFile(final String path) {
        File fileToDelete = new File(path);
//        if (fileToDelete.delete()) {
        if (fileToDelete.isFile()) {
            System.out.println("File deleted: " + fileToDelete.getPath());
        } else {
            System.out.println("Failed to delete: " + fileToDelete.getPath());
        }
    }

    private void concatPathAndFileName(String str) {
        switch (str) {
            case "api/client":
                System.out.println("да, это АПИ КЛИЕНТ");
                break;
            case "api/spec":
                System.out.println("да! Это спек! Кек!");
                break;
        }

    }
}
