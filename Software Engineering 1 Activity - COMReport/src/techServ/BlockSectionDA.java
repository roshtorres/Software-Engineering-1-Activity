package techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import domain.BlockSection;

public class BlockSectionDA 
{
	public BlockSectionDA() throws FileNotFoundException
	{
		Scanner blockSectionInfoFile = new Scanner(
								   new FileReader("C://Users//Rosh Torres//Documents//New Era University//COMReport - Data Files/blockSectionInfo.csv"));
		
		String blockSectionRow = new String();
		blockSectionRow = blockSectionInfoFile.nextLine();
		
		String[] blockSectionSpecific = new String[3];
		blockSectionSpecific = blockSectionRow.split(",");
		
		//Declare the Block Section object
		BlockSection blockSection = new BlockSection();
					
		//Put data in the Block Section object
		blockSection.setBlockCode(blockSectionSpecific[0]);
		blockSection.setDescription(blockSectionSpecific[1]);
		blockSection.setAdviser(blockSectionSpecific[2]);
				
		//Insert here Student object
		StudentDA studentDA = new StudentDA();
		blockSection.setStudentList(studentDA.getStudentList());
		
		System.out.println(blockSection);
	}
	
}
