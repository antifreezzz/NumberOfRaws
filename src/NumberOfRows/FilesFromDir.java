package NumberOfRows;

import java.io.File;

/**
 * Created by Klementyev on 31.08.2017.
 */
public class FilesFromDir{
    public void filesFromDir(File folder)
    {

        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries)
        {
            if (entry.isDirectory())
            {
                filesFromDir(entry);
                return ;
 //               continue;
            }
            // иначе вам попался файл, обрабатывайте его!
        }
    }
}



