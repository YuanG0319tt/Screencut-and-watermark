package watermark;

import java.awt.image.BufferedImage;
/**
 * 
 * @author LiMengyuan
 *
 */
public class FileBean {
	private String filename;
	private BufferedImage buffer;
	public FileBean(String filename, BufferedImage buffer){
		this.filename = filename;
		this.buffer = buffer;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public BufferedImage getBuffer() {
		return buffer;
	}
	public void setBuffer(BufferedImage buffer) {
		this.buffer = buffer;
	}
}
