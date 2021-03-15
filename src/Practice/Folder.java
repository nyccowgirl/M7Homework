package Practice;

import java.util.*;

public class Folder  {
	
	private List<Folder> folders;
	private List<FileItem> files;
	private int maxSize;
	
	private String name;

	public Folder(String name, int maxSize) {
		this.name = name;
		this.maxSize = maxSize;
		folders = new ArrayList<Folder>();
		files = new ArrayList<FileItem>();
	}

	public List<Folder> getFolders() {
		return folders;
	}
	
	public List<FileItem> getFiles() {
		return files;
	}
	
	public String getName() {
		return name;
	}

	public int getMaxSize() {
		return maxSize;
	}

	@Override
	public String toString() {
		return name;
	}

	public void addFile(FileItem file) {
		files.add(file);
	}
	
	public void addFolder(Folder folder) {
		folders.add(folder);
	}
	
	public int getSizeOfFiles() {
		int fileSize = 0;
		for(FileItem file : files) {
			fileSize += file.getSize();
		}
		return fileSize;
	}
	
	
	public boolean containsFile(FileItem file) {
		if(files.contains(file)) {
			return true;
		} else {
			return false;
		}
	}


	// prints here to help with testing!
	public boolean isSpaceInFolderOrSubfolders(FileItem newFile) {
		int currentSpace = getSizeOfFiles();
		int newSpace = newFile.getSize();
		int neededSpace = currentSpace + newSpace;
		if(neededSpace <= maxSize) {
			System.out.println("Space found! File going in " + name+ " (has max of " + maxSize + " and needs " + neededSpace+")");
			return true;
		} else {
			System.out.println("No space in " + name + " (has max of " + maxSize + " and needs " + neededSpace+")");
			boolean space = false;
			for (int i = 0; i < folders.size() && !space; i++) {
				space = folders.get(i).isSpaceInFolderOrSubfolders(newFile);
			}
			return space;
		}

	}
}
