public int trap(int[] height) {
    int sum = 0;
    //�����˵��в��ÿ��ǣ���Ϊһ��������ˮ�������±�� 1 �� length - 2
    for (int i = 1; i < height.length - 1; i++) {
        int max_left = 0;
        //�ҳ�������
        for (int j = i - 1; j >= 0; j--) {
            if (height[j] > max_left) {
                max_left = height[j];
            }
        }
        int max_right = 0;
        //�ҳ��ұ����
        for (int j = i + 1; j < height.length; j++) {
            if (height[j] > max_right) {
                max_right = height[j];
            }
        }
        //�ҳ����˽�С��
        int min = Math.min(max_left, max_right);
        //ֻ�н�С��һ�δ��ڵ�ǰ�еĸ߶ȲŻ���ˮ���������������ˮ
        if (min > height[i]) {
            sum = sum + (min - height[i]);
        }
    }
    return sum;
}

 