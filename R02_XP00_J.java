public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
 if (!someFile.delete()) {
   // Hangle failure to delete the file
 }
 
}



public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
 
}
