package com.kappa.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public static double currentNumber = 0;
    public static int lastAction = -1;

    public void clearClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);

        String newText = mainText.getText().toString();

        if(newText.length() > 1)
        {
            newText = newText.substring(0, newText.length() - 1);

            mainText.setText(newText);
            mainText.setSelection(mainText.getText().length());
        }
        else
        {
            String previewText = preview.getText().toString();

            if(previewText.length() == 0)
            {
                mainText.setText("");
                mainText.setSelection(mainText.getText().length());

                preview.setText("");
            }
        }
    }

    public void clearAllClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);
        TextView resultPreview = (TextView) findViewById(R.id.resultPreview);

        mainText.setText("");
        mainText.setSelection(mainText.getText().length());

        preview.setText("");

        resultPreview.setText("");

        currentNumber = 0;
        lastAction = -1;
    }

    public void moduleClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);
        TextView resultPreview = (TextView) findViewById(R.id.resultPreview);

        if(mainText.length() != 0 && preview.length() == 0)
        {
            currentNumber = Double.parseDouble(mainText.getText().toString());

            preview.setText(currentNumber + " % ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            lastAction = 4;
        }
        else if(mainText.length() != 0 && preview.length() != 0)
        {
            double current = Double.parseDouble(mainText.getText().toString());

            switch(lastAction)
            {
                case 0:
                    currentNumber *= current;
                    break;
                case 1:
                    currentNumber /= current;
                    break;
                case 2:
                    currentNumber += current;
                    break;
                case 3:
                    currentNumber -= current;
                    break;
                case 4:
                    currentNumber %= current;
                    break;
                default:
                    return;
            }

            preview.setText(preview.getText().toString() + "" + current + " % ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            resultPreview.setText("(" + currentNumber + ")");

            lastAction = 4;
        }
    }

    public void equalsClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);
        TextView resultPreview = (TextView) findViewById(R.id.resultPreview);

        if(mainText.length() != 0 && preview.length() != 0)
        {
            double finalNumber = 0;
            double current = Double.parseDouble(mainText.getText().toString());

            switch(lastAction)
            {
                case 0:
                    finalNumber = currentNumber * current;
                    break;
                case 1:
                    finalNumber = currentNumber / current;
                    break;
                case 2:
                    finalNumber = currentNumber + current;
                    break;
                case 3:
                    finalNumber = currentNumber - current;
                    break;
                case 4:
                    finalNumber = currentNumber % current;
                    break;
                default:
                    return;
            }

            mainText.setText("" + finalNumber);
            mainText.setSelection(mainText.getText().length());

            preview.setText("");

            resultPreview.setText("");
        }
    }

    public void multiplyClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);
        TextView resultPreview = (TextView) findViewById(R.id.resultPreview);

        if(mainText.length() != 0 && preview.length() == 0)
        {
            currentNumber = Double.parseDouble(mainText.getText().toString());

            preview.setText(currentNumber + " * ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            lastAction = 0;
        }
        else if(mainText.length() != 0 && preview.length() != 0)
        {
            double current = Double.parseDouble(mainText.getText().toString());

            switch(lastAction)
            {
                case 0:
                    currentNumber *= current;
                    break;
                case 1:
                    currentNumber /= current;
                    break;
                case 2:
                    currentNumber += current;
                    break;
                case 3:
                    currentNumber -= current;
                    break;
                case 4:
                    currentNumber %= current;
                    break;
                default:
                    return;
            }

            preview.setText(preview.getText().toString() + "" + current + " * ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            resultPreview.setText("(" + currentNumber + ")");

            lastAction = 0;
        }
    }

    public void divideClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);
        TextView resultPreview = (TextView) findViewById(R.id.resultPreview);

        if(mainText.length() != 0 && preview.length() == 0)
        {
            currentNumber = Double.parseDouble(mainText.getText().toString());

            preview.setText(currentNumber + " / ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            lastAction = 1;
        }
        else if(mainText.length() != 0 && preview.length() != 0)
        {
            double current = Double.parseDouble(mainText.getText().toString());

            switch(lastAction)
            {
                case 0:
                    currentNumber *= current;
                    break;
                case 1:
                    currentNumber /= current;
                    break;
                case 2:
                    currentNumber += current;
                    break;
                case 3:
                    currentNumber -= current;
                    break;
                case 4:
                    currentNumber %= current;
                    break;
                default:
                    return;
            }

            preview.setText(preview.getText().toString() + "" + current + " / ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            resultPreview.setText("(" + currentNumber + ")");

            lastAction = 1;
        }
    }

    public void plusClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);
        TextView resultPreview = (TextView) findViewById(R.id.resultPreview);

        if(mainText.length() != 0 && preview.length() == 0)
        {
            currentNumber = Double.parseDouble(mainText.getText().toString());

            preview.setText(currentNumber + " + ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            lastAction = 2;
        }
        else if(mainText.length() != 0 && preview.length() != 0)
        {
            double current = Double.parseDouble(mainText.getText().toString());

            switch(lastAction)
            {
                case 0:
                    currentNumber *= current;
                    break;
                case 1:
                    currentNumber /= current;
                    break;
                case 2:
                    currentNumber += current;
                    break;
                case 3:
                    currentNumber -= current;
                    break;
                case 4:
                    currentNumber %= current;
                    break;
                default:
                    return;
            }

            preview.setText(preview.getText().toString() + "" + current + " + ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            resultPreview.setText("(" + currentNumber + ")");

            lastAction = 2;
        }
    }

    public void minusClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);
        TextView preview = (TextView) findViewById(R.id.preview);
        TextView resultPreview = (TextView) findViewById(R.id.resultPreview);

        if(mainText.length() == 0)
        {
            mainText.setText("-");
        }
        else if(mainText.length() != 0 && preview.length() == 0)
        {
            currentNumber = Double.parseDouble(mainText.getText().toString());

            preview.setText(currentNumber + " - ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            lastAction = 3;
        }
        else if(mainText.length() != 0 && preview.length() != 0)
        {
            double current = Double.parseDouble(mainText.getText().toString());

            switch(lastAction)
            {
                case 0:
                    currentNumber *= current;
                    break;
                case 1:
                    currentNumber /= current;
                    break;
                case 2:
                    currentNumber += current;
                    break;
                case 3:
                    currentNumber -= current;
                    break;
                case 4:
                    currentNumber %= current;
                    break;
                default:
                    return;
            }

            preview.setText(preview.getText().toString() + "" + current + " - ");

            mainText.setText("");
            mainText.setSelection(mainText.getText().length());

            resultPreview.setText("(" + currentNumber + ")");

            lastAction = 3;
        }
    }

    public void oneClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "1");
        mainText.setSelection(mainText.getText().length());
    }

    public void twoClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "2");
        mainText.setSelection(mainText.getText().length());
    }

    public void threeClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "3");
        mainText.setSelection(mainText.getText().length());
    }

    public void fourClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "4");
        mainText.setSelection(mainText.getText().length());
    }

    public void fiveClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "5");
        mainText.setSelection(mainText.getText().length());
    }

    public void sixClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "6");
        mainText.setSelection(mainText.getText().length());
    }

    public void sevenClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "7");
        mainText.setSelection(mainText.getText().length());
    }

    public void eightClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "8");
        mainText.setSelection(mainText.getText().length());
    }

    public void nineClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "9");
        mainText.setSelection(mainText.getText().length());
    }

    public void zeroClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + "0");
        mainText.setSelection(mainText.getText().length());
    }

    public void dotClicked(View view)
    {
        EditText mainText = (EditText) findViewById(R.id.mainText);

        mainText.setText(mainText.getText().toString() + ".");
        mainText.setSelection(mainText.getText().length());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
