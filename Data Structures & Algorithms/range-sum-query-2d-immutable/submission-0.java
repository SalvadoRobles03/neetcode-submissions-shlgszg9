class NumMatrix {

    ArrayList<ArrayList<Integer>> prefixMatrix = new ArrayList<>();
    int noRows;
    int noCol;

    public NumMatrix(int[][] matrix) {
        noRows=matrix.length;
        noCol=matrix[0].length;

            prefixMatrix.add(new ArrayList<Integer>());
            for(int col =0;col<noCol+1;col++){
                prefixMatrix.get(0).add(0);
            }
        
        for(int row =1;row<noRows+1;row++){
            prefixMatrix.add(new ArrayList<Integer>());
            prefixMatrix.get(row).add(0);
            for(int col =1;col<noCol+1;col++){
                prefixMatrix.get(row).add(
                    prefixMatrix.get(row-1).get(col)+
                    prefixMatrix.get(row).get(col-1)-
                    prefixMatrix.get(row-1).get(col-1)+
                    matrix[row-1][col-1]
                );

            }
        }

        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result=0;

        result=(
            prefixMatrix.get(row2+1).get(col2+1)-
            prefixMatrix.get(row1).get(col2+1)-
            prefixMatrix.get(row2+1).get(col1)+
            prefixMatrix.get(row1).get(col1)
        );
        
        return result;
    }
}
